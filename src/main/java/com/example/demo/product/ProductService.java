package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

//    ProductRepository productRepository;
//    @Autowired
//    ProductService(ProductRepository productRepository){
//        this.productRepository = productRepository;
//    }
    public ProductVO findProduct(int productId) {
        return productRepository.findProduct(productId);
    }

    public void saveProduct(ProductVO productVO) {
        productRepository.save(productVO);
    }
}
