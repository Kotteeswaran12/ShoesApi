package com.Clothing.api.productrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Clothing.api.model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

   @Query("SELECT  p from Products p WHERE " +
   "LOWER(p.name) LIKE LOWER( CONCAT('%' ,:keyword , '%'))")
    public List<Products> findAllByName(String keyword);

}
