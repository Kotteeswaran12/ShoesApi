package com.Clothing.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Clothing.api.model.offer;
import com.Clothing.api.service.OfferService;




@RestController
@CrossOrigin
public class OfferController {

    @Autowired
   OfferService service;

   @GetMapping("/offer")
   public List<offer> GetAllproducts() {
       return service.GetAllproducts();
   }
   
    @PostMapping("/offer")
    public offer AddProducts(@RequestBody offer prod) {
        //TODO: process POST request
        
        return service.AddProducts(prod);
    }
   @PutMapping("/offer")
	public offer UpdateProd( @RequestBody offer Prod) {
		return service.UpdateProd(Prod);
	}
}
