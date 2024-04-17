package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    //상품 조회
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public @ResponseBody ProductVO findProducts (@PathVariable(value = "id") int productId) {
        return productService.findProduct(productId);
    }

    // 상품 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public @ResponseBody String saveProduct (@RequestBody ProductVO productVO) {
        System.out.println("post");
        System.out.println(productVO);
        productService.saveProduct(productVO);
        return "Success";
    }
}
