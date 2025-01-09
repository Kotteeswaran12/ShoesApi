package com.Clothing.api.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartitem")
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    

    private String name;
    private int price;
    @ElementCollection
    private List<String> image;



    public Cart(){
        super();
    }

    public Cart(int id, List<String> image, String name, int price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
    }



    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
    
}
