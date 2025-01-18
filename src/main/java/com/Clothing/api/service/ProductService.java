package com.Clothing.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Clothing.api.model.Products;
import com.Clothing.api.productrepo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;

	public List<Products> FindProducts() {
		
		return repo.findAll();
	}

	public Products AddProducts(Products prod) {
		
		return repo.save(prod);
	}

	public Products DeleteProdByid(int id) {
		
		 repo.deleteById(id);
		 return null;
	}

	public Products Updateproduct( Products prod) {
		
		return repo.save(prod);
	}

	public Products GetProductByid(int id) {
		
		return repo.findById(id).orElse(null);
	}

    public List<Products> getByProductName(String keyword) {
        
        return repo.findAllByName(keyword);
    }
	
	
	
}
