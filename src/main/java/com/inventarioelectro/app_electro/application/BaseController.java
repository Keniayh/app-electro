package com.inventarioelectro.app_electro.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioelectro.app_electro.domain.entity.Product;
import com.inventarioelectro.app_electro.infrastructure.repositories.ProductRepositoryImpl;

@RestController
@RequestMapping("/api")
public class BaseController {
    @Autowired
    private ProductRepositoryImpl serviceProduct;

    @GetMapping
    public List<Product> list(){
        return serviceProduct.findAll();
    }
    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return serviceProduct.findById(id);
    }
}
