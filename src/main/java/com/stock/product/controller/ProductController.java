package com.stock.product.controller;

import com.stock.product.DTOs.ProductCreate;
import com.stock.product.DTOs.ProductResponse;
import com.stock.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductCreate productData) {
        ProductResponse product = productService.addProduct(productData);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

}
