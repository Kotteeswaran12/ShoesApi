package com.Clothing.api.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.Cart;
@Repository
public interface CartRepo  extends JpaRepository<Cart, Integer>{
    
}
