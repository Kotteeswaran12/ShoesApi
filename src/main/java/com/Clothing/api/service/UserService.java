package com.Clothing.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clothing.api.model.UserDetails;
import com.Clothing.api.productrepo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo ;    

    public List<UserDetails> GetALLUserDetails() {
        return repo.findAll();
    }

    public UserDetails PostUsersDetails(UserDetails details) {
        return repo.save(details);
    }

    public UserDetails UpdateUserDetailsByid( UserDetails details) {
       return repo.save(details);
    }

   

    public UserDetails DeleteUserById(int id) {
        repo.deleteById(id);
        return null;
    }

    public UserDetails GetUserByName(String userName, String password) {

        if(userName == null || userName.isEmpty()){
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("password cannot be null or empty");
        }
        String lowerCaseUserName = userName.toLowerCase();
        String lowerCasePassword =  password.toLowerCase();
        
        UserDetails user =repo.findByUserNameAndPassword(lowerCaseUserName, lowerCasePassword);
        if(user != null){
            return user ; 
        }else{
            throw new RuntimeException("User not found with the given credentials");
        }
    }   
}