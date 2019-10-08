package com.virtusa.KnowlegeOverFlow.Repository;

import com.virtusa.KnowlegeOverFlow.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
    public User findByUserName(String username);
}
