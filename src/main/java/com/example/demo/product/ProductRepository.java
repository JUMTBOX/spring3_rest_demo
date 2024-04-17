package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<Integer, ProductVO> db = new HashMap<>();
    private int id = 1;

    public ProductVO findProduct (int productId) {
        return db.get(productId);
    }

    public void save(ProductVO productVO) {
          System.out.println(productVO.getName());
          db.put(id++, productVO);
    }
}
