package com.bishal.onlineshopping.repo;

import com.bishal.onlineshopping.model.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	@RestResource(path = "categoryid")
	Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
