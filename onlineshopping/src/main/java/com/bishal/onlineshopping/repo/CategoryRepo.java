package com.bishal.onlineshopping.repo;

import com.bishal.onlineshopping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    Optional<Category> findCategoryById(Long id);

    void deleteCategoryById(Long id);
}
