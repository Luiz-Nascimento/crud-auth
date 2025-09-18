package com.stock.product.DTOs;

import com.stock.product.enums.UserRole;

public record RegisterDTO(
        String username,
        String password,
        UserRole role
) {
}
