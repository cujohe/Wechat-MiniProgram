package com.it.demo.mapper;

import com.it.demo.domain.CartItem;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CartItemMapper {

    @Select("SELECT * FROM tb_cart_item WHERE user_id = #{userId}")
    List<CartItem> queryCartItemsByUserId(Long userId);

    @Insert("INSERT INTO tb_cart_item (product_id, product_name, product_price, quantity, user_id) " +
            "VALUES (#{productId}, #{productName}, #{productPrice}, #{quantity}, #{userId})")
    void addCartItem(CartItem cartItem);

    @Delete("DELETE FROM tb_cart_item WHERE id = #{id}")
    void removeCartItem(Long id);

    @Delete("DELETE FROM tb_cart_item WHERE user_id = #{userId}")
    void clearCart(Long userId);
}
