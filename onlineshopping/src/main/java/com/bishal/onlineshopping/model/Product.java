package com.bishal.onlineshopping.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {

    public Product(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }



    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public int getPurchases() {
        return purchases;
    }

    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public Product(Long id, String code, String name, String brand, String description, String unitPrice,
                   int quantity, boolean isActive, Long supplierId, int purchases, int views, String imagerUrl) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isActive = isActive;

        this.supplierId = supplierId;
        this.purchases = purchases;
        this.views = views;
        this.imageUrl=imagerUrl;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", quantity=" + quantity +
                ", isActive=" + isActive +
                ", supplierId=" + supplierId +
                ", purchases=" + purchases +
                ", views=" + views +
                ", imageUrl=" + imageUrl+
                '}';
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String code;
    private String name;
    private String brand;
    private String description;
    @Column(name="unit_price")
    private String unitPrice;
    private int quantity;
    @Column(name="is_active")
    private boolean isActive;
    @Column(name="supplier_id")
    private Long supplierId;
    private int purchases;
    private int views;
    @Column(name="image_Url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;


}
