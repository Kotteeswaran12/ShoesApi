package com.Clothing.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clothing.api.model.offer;
import com.Clothing.api.productrepo.OfferRepo;
@Service
public class OfferService {
    @Autowired
    private OfferRepo repo;

    public List<offer> GetAllproducts(){
        return repo.findAll();
    }

    public offer AddProducts(offer prod) {
        // TODO Auto-generated method stub
       return repo.save(prod);
    }

    public offer UpdateProd(offer prod) {
        // TODO Auto-generated method stub
       return repo.save(prod);
    }
}
