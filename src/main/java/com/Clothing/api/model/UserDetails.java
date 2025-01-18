package com.Clothing.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// @Table(name = "Users")
public class UserDetails {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    private String userName;  // Changed to camelCase
    private String userEmail; // Changed to camelCase
    private String password;  // Changed to camelCase


    public UserDetails(){
        super();
    }


    public UserDetails(int id, String userName, String userEmail, String password) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserEmail() {
        return userEmail;
    }


    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    

    
}
