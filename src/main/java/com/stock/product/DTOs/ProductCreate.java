package com.stock.product.DTOs;

import java.math.BigDecimal;

public record ProductCreate(
        String name,
        BigDecimal price
) {
}
