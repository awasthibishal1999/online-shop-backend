package com.bishal.onlineshopping.service;

import com.bishal.onlineshopping.exception.UserNotFoundException;
import com.bishal.onlineshopping.model.Category;
import com.bishal.onlineshopping.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {

    private final CategoryRepo categoryRepo;


    @Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    public Category addCategory(Category category){
        return categoryRepo.save(category);
    }

    public List<Category> findAllCategories(){
        return categoryRepo.findAll();
    }
    public Category updateCategory(Category category){
        return categoryRepo.save(category);
    }
    public Category findCategoryById(Long id){
        return categoryRepo.findCategoryById(id).orElseThrow(() -> new UserNotFoundException
                ("User by id" +  id + "was not found"));
    }
    public void deleteCategory(Long id){
        categoryRepo.deleteCategoryById(id);
    }
}
