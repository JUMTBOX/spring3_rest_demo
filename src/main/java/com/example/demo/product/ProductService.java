package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository = new ProductRepository();
    public String findProduct() {
        return productRepository.findProduct();
    }
}
