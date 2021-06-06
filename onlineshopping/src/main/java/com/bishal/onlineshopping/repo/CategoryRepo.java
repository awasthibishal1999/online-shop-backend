package com.bishal.onlineshopping.repo;

import com.bishal.onlineshopping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel ="category",path = "product-category")
public interface CategoryRepo extends JpaRepository<Category, Long> {
 
}
