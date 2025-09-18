package com.stock.product.service;

import com.stock.product.DTOs.ProductCreate;
import com.stock.product.DTOs.ProductResponse;
import com.stock.product.entity.Product;
import com.stock.product.mappers.ProductMapper;
import com.stock.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    public ProductMapper productMapper;

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream().map(p -> productMapper.productToResponseDto(p)).toList();
    }

    public ProductResponse addProduct(ProductCreate productData) {
        Product product = productMapper.productCreateToEntity(productData);
        productRepository.save(product);
        return productMapper.productToResponseDto(product);
    }
}
