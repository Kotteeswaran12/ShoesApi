package com.Clothing.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Clothing.api.model.Cart;
import com.Clothing.api.service.cartService;




@RestController
@CrossOrigin
public class CartController {
    
    @Autowired
    private cartService service;

    @GetMapping("/cart")
    public List<Cart> GetAllCartprod() {
        return service.GetAllCartprod();
    }

    @PostMapping("/carts")
    public Cart Addtocart(@RequestBody Cart cart) {
        
        
        return service.Addtocart(cart);
    }

   @DeleteMapping("/cart/{id}")
   public void DeleteFromcart(@PathVariable int id){
    service.DeleteFromcart(id);
   }
}
