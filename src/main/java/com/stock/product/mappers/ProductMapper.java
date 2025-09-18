package com.stock.product.mappers;

import com.stock.product.DTOs.ProductCreate;
import com.stock.product.DTOs.ProductResponse;
import com.stock.product.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse productToResponseDto(Product product);
    Product productCreateToEntity(ProductCreate productData);
}
