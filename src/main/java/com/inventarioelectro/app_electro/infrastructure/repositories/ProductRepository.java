package com.inventarioelectro.app_electro.infrastructure.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.inventarioelectro.app_electro.domain.entity.Product;

@Component
public class ProductRepository{
    List<Product> products;

    public ProductRepository() {
        this.products = Arrays.asList(
            new Product(1L, "Laptop", 4500000L),
            new Product(2L, "Smartphone", 2000000L),
            new Product(3L, "Tablet", 1000000L),
            new Product(4L, "Monitor", 1800000L),
            new Product(5L, "Keyboard", 150000L),
            new Product(6L, "Mouse", 80000L),
            new Product(7L, "Printer", 700000L),
            new Product(8L, "External Hard Drive", 350000L),
            new Product(9L, "Headphones", 200000L),
            new Product(10L, "Webcam", 250000L)
        );
    }
    
    public List<Product> findAll() {
        return products;
    }

    public Product findById(long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
        // orElseThrow() -> evita un retorno nulo
    }
}
