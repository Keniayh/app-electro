package com.inventarioelectro.app_electro.domain.servicie;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioelectro.app_electro.domain.entity.Product;
import com.inventarioelectro.app_electro.infrastructure.repositories.ProductRepositoryImpl;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepositoryImpl repositoryProduct;

    public List<Product> findAll() {
        return repositoryProduct.findAll().stream().map(p-> {
            Double priceTax = p.getPrice() * 1.45d;
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repositoryProduct.findById(id);
    }
}
