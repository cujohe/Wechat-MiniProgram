package com.it.demo.domain;

import lombok.Data;

@Data
public class CartItem {
    private Long id;
    private Long productId;
    private String productName;
    private Double productPrice;
    private Integer quantity;
    private Long userId; // 假设每个用户有一个购物车
}
