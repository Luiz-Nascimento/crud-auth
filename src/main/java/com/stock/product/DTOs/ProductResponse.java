package com.stock.product.DTOs;

import java.math.BigDecimal;

public record ProductResponse(
        Integer id,
        String name,
        BigDecimal price
) {
}
