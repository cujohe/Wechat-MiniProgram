package com.it.demo.service;

import com.it.demo.domain.CartItem;
import com.it.demo.util.MyException;

import java.util.List;

public interface ICartService {
    List<CartItem> getCartItems(Long userId) throws MyException;
    void addCartItem(CartItem cartItem) throws MyException;
    void removeCartItem(Long id) throws MyException;
    void clearCart(Long userId) throws MyException;
}
