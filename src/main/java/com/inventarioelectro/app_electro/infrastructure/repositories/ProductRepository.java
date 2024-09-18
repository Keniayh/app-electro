package com.inventarioelectro.app_electro.infrastructure.repositories;

import java.util.List;

import com.inventarioelectro.app_electro.domain.entity.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}
