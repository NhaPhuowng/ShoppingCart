package com.hieu.demojpa.service;

import com.hieu.demojpa.entity.Products;

import java.math.BigDecimal;
import java.util.Map;


public interface ShoppingCartService {
    void addProduct(Products product);

    void removeProduct(Products product);

    Map<Products, Integer> getProductsInCart();

    //BigDecimal getTotal();
}
