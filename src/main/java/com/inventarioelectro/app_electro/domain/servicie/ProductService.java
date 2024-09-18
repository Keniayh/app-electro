package com.inventarioelectro.app_electro.domain.servicie;

import java.util.List;
import java.util.stream.Collectors;


import com.inventarioelectro.app_electro.domain.entity.Product;
import com.inventarioelectro.app_electro.infrastructure.repositories.ProductRepository;

public class ProductService{
    
    private ProductRepository repositoryProduct = new ProductRepository();
    public List<Product> findAll(){
        return repositoryProduct.findAll().stream().map(p ->{
            Double priceTax = p.getPrice() * 1.45d;

            // Product newProduct = new Product(p.getId(), p.getName(),

            Product newProduct = (Product) p.clone();
            // p.setPrice(priceImp.longValue());
            newProduct.setPrice(priceTax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }
    public Product findById(Long id){
        return repositoryProduct.findById(id);
    }
}
