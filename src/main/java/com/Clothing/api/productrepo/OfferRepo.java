package com.Clothing.api.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.offer;
@Repository
public interface OfferRepo extends JpaRepository<offer, Integer>{
    
}
