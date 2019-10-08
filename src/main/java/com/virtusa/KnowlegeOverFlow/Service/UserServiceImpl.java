package com.virtusa.KnowlegeOverFlow.Service;

import com.virtusa.KnowlegeOverFlow.Entity.User;
import com.virtusa.KnowlegeOverFlow.ErrorHandling.KnowledgeOverflowException;
import com.virtusa.KnowlegeOverFlow.Interceptors.PasswordHashing;
import com.virtusa.KnowlegeOverFlow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;



    byte[] salt = PasswordHashing.getSalt();

    public UserServiceImpl() throws NoSuchAlgorithmException {
    }

    @Override
    public boolean login(String email, String password) throws Exception {
        try {
            User user = userRepository.findByEmail(email);
           //String hashedPassword=get_SHA_256_SecurePassword(password,salt);
            String hashedPassword=PasswordHashing.get_SHA_256_SecurePassword(password,salt);
            if(user.getPassword().equals(hashedPassword) && user.getIsActive()==true)
            {
                return true;
            }
            else
            {
                throw new KnowledgeOverflowException(1001,"Incorrect Credentials");
            }
        }
        catch(NullPointerException npe) {
            throw new KnowledgeOverflowException(1000,"user not found");
        }

    }

    @Override
    public boolean register(User user) throws Exception{
        String passwordToHash = user.getPassword();

        if(userRepository.findByEmail(user.getEmail())==null)
        {
            if(userRepository.findByUserName(user.getUserName())==null) {
                user.setIsActive(true);
                user.setPassword(PasswordHashing.get_SHA_256_SecurePassword(passwordToHash,salt));
                userRepository.save(user);
                return true;
            }
            else
            {
                throw new KnowledgeOverflowException(1003, "UserName already Exists");
            }
        }
        else
        {
            throw new KnowledgeOverflowException(1002, "Email already Exists");

        }

    }

    @Override
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);

    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    @Override
    public User getOne(int uid) {
        return userRepository.getOne(uid);
    }



}
