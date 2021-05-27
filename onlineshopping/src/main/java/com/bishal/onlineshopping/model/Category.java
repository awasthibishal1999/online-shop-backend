package com.bishal.onlineshopping.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Category implements Serializable{

        public Category(){}
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }



    public Category(Long id, String name, String description, String imageUrl, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.isActive = isActive;
    }




    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                "isActive=" + isActive +
                '}';
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    @Column(name="is_active")
    private boolean isActive=true;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "category")
    private Set<Product> product;

}
