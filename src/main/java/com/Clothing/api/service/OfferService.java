package com.Clothing.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clothing.api.model.OfferProd;
import com.Clothing.api.productrepo.OfferRepo;

@Service
public class OfferService {
    @Autowired
    private OfferRepo repo;

    public List<OfferProd> getAllOfferProd() {
        // TODO Auto-generated method stub
       return repo.findAll();
    }

    public OfferProd AddOfferProd(OfferProd product) {
        // TODO Auto-generated method stub
        return repo.save(product);
    }

    public void DeleteByid(int id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
    }

    public OfferProd UpdateOfferprod(OfferProd prod) {
        // TODO Auto-generated method stub
       return repo.save(prod);
    }
}
