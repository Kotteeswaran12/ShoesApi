package com.Clothing.api.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prod")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private int price;
	private double rating;
	private boolean fav;
	
	@ElementCollection
//	@Column(columnDefinition = "imageurl")
	private List<String> image;

	
	
	
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String name, int price, double rating, List<String> image, boolean  fav) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.image = image;
		this.fav=fav;
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

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
	
	
	
}
