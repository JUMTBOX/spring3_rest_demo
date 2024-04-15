package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
    @Autowired
    ProductService productService;
    //상품 조회
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String findProducts () {
        System.out.println("GET");
        return productService.findProduct();
    }
    
    // 상품 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct () {
        System.out.println("POST");
        productService.saveProduct();
    }
}
