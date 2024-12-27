package com.Clothing.api.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "Offer")
public class OfferProd {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int price;
    private String name;
    private double rating;

    @Version
    private int version;

    @ElementCollection
    // @Column(columnDefinition="Offerimage")
    private List<String>image;

    public OfferProd(){
        super();
    }

    public OfferProd(int id, int price, String name, double rating, List<String> image) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.rating = rating;
        this.image = image;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }


    
}
