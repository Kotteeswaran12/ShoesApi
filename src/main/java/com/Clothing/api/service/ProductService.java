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
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Products AddProducts(Products prod) {
		// TODO Auto-generated method stub
		return repo.save(prod);
	}

	public Products DeleteProdByid(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return null;
	}

	public Products Updateproduct( Products prod) {
		// TODO Auto-generated method stub
		return repo.save(prod);
	}

	public Products GetProductByid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}
	
	
	
}
