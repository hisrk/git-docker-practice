package com.gitdockerpractice.controller;

import com.gitdockerpractice.entity.Product;
import com.gitdockerpractice.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@ResponseBody
@RequestMapping("/api/v1/products")
public class ProductController {


    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//http://localhost:8080/api/v1/products/saveProduct
    
    @PostMapping("/saveProduct")
    @ResponseStatus(HttpStatus.OK)
    public String saveProduct(@RequestBody Product product){

        Product save = productRepository.save(product);

        System.out.println(product);

        return "product is saved";

    }






}
