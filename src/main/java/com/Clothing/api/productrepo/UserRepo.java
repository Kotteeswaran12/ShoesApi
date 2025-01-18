package com.Clothing.api.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.UserDetails;

@Repository
public interface  UserRepo  extends JpaRepository<UserDetails, Integer>{

    UserDetails findByUserNameAndPassword(String userName, String password);


   

   
    
}
