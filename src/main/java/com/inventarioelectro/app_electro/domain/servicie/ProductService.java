package com.inventarioelectro.app_electro.domain.servicie;

import java.util.List;

import com.inventarioelectro.app_electro.domain.entity.Product;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
} 


