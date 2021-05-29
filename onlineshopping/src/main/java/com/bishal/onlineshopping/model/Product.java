package com.bishal.onlineshopping.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="product")
public class Product implements Serializable {

    public Product(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



   
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public Product(Long id, String code, String name, String brand, String description, String unitPrice,
                   int quantity, boolean active, String imagerUrl) {
        this.id = id;
       
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.active =active;

       
        this.imageUrl=imagerUrl;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
              
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", quantity=" + quantity +
                ", isActive=" + active +
               ", imageUrl=" + imageUrl+
                '}';
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String brand;
    private String description;
    @Column(name="unit_price")
    private String unitPrice;
    private int quantity;
     private boolean active;
    @Column(name="image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;


}
