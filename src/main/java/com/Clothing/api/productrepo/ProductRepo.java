package com.Clothing.api.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
