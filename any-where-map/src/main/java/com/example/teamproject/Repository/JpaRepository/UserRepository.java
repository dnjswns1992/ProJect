package com.example.teamproject.Repository.JpaRepository;

import com.example.teamproject.JpaClass.UserTable.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


    public User findByUserId(String userId);

}
