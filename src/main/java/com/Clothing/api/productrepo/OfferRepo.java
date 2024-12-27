package com.Clothing.api.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.OfferProd;

@Repository
public interface OfferRepo extends JpaRepository<OfferProd, Integer>{
    
}
