package com.gitdockerpractice.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tables")
public class Product {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(name="productName",unique = false,nullable = false)
     String productName;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
