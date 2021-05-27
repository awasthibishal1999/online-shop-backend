package com.bishal.onlineshopping.service;

import com.bishal.onlineshopping.exception.UserNotFoundException;
import com.bishal.onlineshopping.model.Product;
import com.bishal.onlineshopping.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public Product addProduct(Product product){
        product.setCode(UUID.randomUUID().toString());
        return productRepo.save(product);
    }
    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }
    public Product updateProduct(Product product){
        return productRepo.save(product);
    }
    public Product findProductById(Long id){
        return productRepo.findProductById(id).orElseThrow(() -> new UserNotFoundException
                ("User by id" +  id + "was not found"));
    }
    public void deleteProduct(Long id){
        productRepo.deleteEmployeeById(id);
    }

}
