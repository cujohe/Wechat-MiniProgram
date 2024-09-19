package com.it.demo.service.impl;

import com.it.demo.domain.CartItem;
import com.it.demo.mapper.CartItemMapper;
import com.it.demo.service.ICartService;
import com.it.demo.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    CartItemMapper cartItemMapper;

    @Override
    public List<CartItem> getCartItems(Long userId) throws MyException {
        if (userId == null) {
            throw new MyException("请传入正确的用户ID");
        }
        return cartItemMapper.queryCartItemsByUserId(userId);
    }

    @Override
    public void addCartItem(CartItem cartItem) throws MyException {
        if (cartItem == null || cartItem.getProductId() == null || cartItem.getUserId() == null) {
            throw new MyException("请传入正确的商品信息和用户ID");
        }
        cartItemMapper.addCartItem(cartItem);
    }

    @Override
    public void removeCartItem(Long id) throws MyException {
        if (id == null) {
            throw new MyException("请传入正确的购物车条目ID");
        }
        cartItemMapper.removeCartItem(id);
    }

    @Override
    public void clearCart(Long userId) throws MyException {
        if (userId == null) {
            throw new MyException("请传入正确的用户ID");
        }
        cartItemMapper.clearCart(userId);
    }
}
