package com.Clothing.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clothing.api.model.Cart;
import com.Clothing.api.productrepo.CartRepo;

@Service
public class cartService {
    @Autowired
    private CartRepo repo;

    public List<Cart> GetAllCartprod() {
       
        return repo.findAll();
    }

    public Cart Addtocart(Cart cart) {
    
        return repo.save(cart);
    }

    public void DeleteFromcart(int id) {
        
        repo.deleteById(id);
    }
}
