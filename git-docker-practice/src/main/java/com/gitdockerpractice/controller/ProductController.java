package com.gitdockerpractice.controller;

import com.gitdockerpractice.entity.Product;
import com.gitdockerpractice.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Component
@ResponseBody
@RequestMapping("/api/v1/products")
public class ProductController {


    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    Logger logger =LoggerFactory.getLogger(ProductController.class);


//http://localhost:8080/api/v1/products/saveProduct
    
    @PostMapping("/saveProduct")
    @ResponseStatus(HttpStatus.OK)
    public String saveProduct(@RequestBody Product product){

           logger.info("Before Saving"+" " +new Date());

        Product save = productRepository.save(product);

        System.out.println(product);

        logger.info("After Saving"+ new Date());

        return "product is saved";

    }






}
