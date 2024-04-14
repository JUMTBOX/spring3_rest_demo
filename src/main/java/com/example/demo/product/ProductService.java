package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;
    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public String findProduct() {
        return productRepository.findProduct();
    }

    public void saveProduct() {
        productRepository.save();
    }
}
