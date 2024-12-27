package com.Clothing.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Clothing.api.model.OfferProd;
import com.Clothing.api.service.OfferService;




@RestController

public class OfferController {

    @Autowired
    private OfferService service;

    @GetMapping("/offer")
    public List<OfferProd> getAllOfferProd() {
        return service.getAllOfferProd();
    }
    
    @PostMapping("/offer")
    public OfferProd AddOfferProd(@RequestBody OfferProd product) {
        //TODO: process POST request
        
        return service.AddOfferProd(product);
    }
    
    @DeleteMapping("/offer/{id}")
    public void DeleteByid(@PathVariable int id){
        service.DeleteByid(id);
    }

    @PutMapping("/offer")
    public OfferProd UpdateOfferprod( @RequestBody OfferProd prod) {
        //TODO: process PUT request
        
        return service.UpdateOfferprod(prod);
    }
}
