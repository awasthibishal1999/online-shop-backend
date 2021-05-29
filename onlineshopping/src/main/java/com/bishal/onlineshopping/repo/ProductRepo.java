package com.bishal.onlineshopping.repo;

import com.bishal.onlineshopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
 //   Optional<Product> findProductById(Long id);

   // void deleteEmployeeById(Long id);
}
