// package com.inventarioelectro.app_electro.application;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;


// import com.inventarioelectro.app_electro.domain.entity.Product;
// import com.inventarioelectro.app_electro.domain.servicie.ProductService;

// import java.util.List;

// @RestController
// @RequestMapping("/api")
// public class ProductController {
//     private ProductService serviceProduct = new ProductService();

//     @GetMapping
//     public List<Product> list(){
//         return serviceProduct.findAll();
//     }

//     @GetMapping("/{id}")
//     public Product show(@PathVariable Long id) {
//         return serviceProduct.findById(id);
//     }
// }
