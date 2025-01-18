package com.Clothing.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Clothing.api.model.Products;
import com.Clothing.api.service.ProductService;



@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	@GetMapping("/products")
	public List<Products> FindProducts() {
		return service.FindProducts();
	}
	@GetMapping("/products/{id}")
	public Products GetProductByid(@PathVariable int id) {
		return service.GetProductByid(id);
	}
	
	@PostMapping("/products")
	public Products AddProducts(@RequestBody Products prod) {
		return service.AddProducts(prod);
	}


	@DeleteMapping("/products/{id}")
	public Products deleteProductsid(@PathVariable int id) {
		return service.DeleteProdByid(id);
	}
	
	@PutMapping("/products")
	public Products Updateproduct( @RequestBody Products Prod) {
		
		
		return service.Updateproduct(Prod);
	}
	@GetMapping("/products/search")
	public List<Products> getByProductName( String keyword) {
		
		return service.getByProductName (keyword);
	}
	
}
