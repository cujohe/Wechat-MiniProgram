package com.it.demo.controller;

import com.it.demo.domain.CartItem;
import com.it.demo.service.ICartService;
import com.it.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ICartService cartService;

    @GetMapping("/getCartItems")
    public Result getCartItems(@RequestParam Long userId) {
        try {
            List<CartItem> cartItems = cartService.getCartItems(userId);
            return new Result(200, "查询成功", cartItems);
        } catch (Exception e) {
            return new Result(202, e.getMessage(), null);
        }
    }

    @PostMapping("/addCartItem")
    public Result addCartItem(@RequestBody CartItem cartItem) {
        try {
            cartService.addCartItem(cartItem);
            return new Result(200, "添加成功", null);
        } catch (Exception e) {
            return new Result(202, e.getMessage(), null);
        }
    }

    @DeleteMapping("/removeCartItem/{id}")
    public Result removeCartItem(@PathVariable Long id) {
        try {
            cartService.removeCartItem(id);
            return new Result(200, "删除成功", null);
        } catch (Exception e) {
            return new Result(202, e.getMessage(), null);
        }
    }

    @DeleteMapping("/clearCart")
    public Result clearCart(@RequestParam Long userId) {
        try {
            cartService.clearCart(userId);
            return new Result(200, "清空成功", null);
        } catch (Exception e) {
            return new Result(202, e.getMessage(), null);
        }
    }
}
