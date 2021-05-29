package com.bishal.onlineshopping.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="category")
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

   

   
   


    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
       
    }




    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
               
                '}';
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String name;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "category")
    private Set<Product> product;

}
