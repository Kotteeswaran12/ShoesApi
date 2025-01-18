package com.Clothing.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Clothing.api.model.UserDetails;
import com.Clothing.api.service.UserService;




@RestController
@CrossOrigin
public class UserController {
 
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<UserDetails> GetALLUserDetails() {
        return service.GetALLUserDetails();
    }
    @PutMapping("/users")
    public UserDetails UpdateUserDetailsByid( @RequestBody UserDetails details) {
        //TODO: process PUT request
        
        return service.UpdateUserDetailsByid(details );
    }
    @PostMapping("/users")
    public UserDetails PostUsersDetails(@RequestBody UserDetails details) {
        //TODO: process POST request
        
        return service.PostUsersDetails(details);
    }
    @DeleteMapping("/users/{id}")
        public UserDetails DeleteUserById (@PathVariable int id ){
            return service.DeleteUserById(id);
        }
    
        @GetMapping("/users/{userName}/{password}")
        public UserDetails  GetUserByName(@PathVariable String userName ,@PathVariable String password) {
          
            return service.GetUserByName(userName , password);
        }
        
}
