package com.virtusa.KnowlegeOverFlow.Service;


import com.virtusa.KnowlegeOverFlow.Entity.User;
import com.virtusa.KnowlegeOverFlow.ErrorHandling.KnowledgeOverflowException;

public interface UserService {
    public boolean login(String email, String password) throws Exception;
    public boolean register(User user) throws Exception;
    public User findByEmail(String email);
    public void update(User user);
    public User findByUserName(String username);
  public  User getOne(int uid);
    //public void delete(User user);

}
