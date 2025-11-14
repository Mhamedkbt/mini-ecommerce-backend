package com.mhamed.ecommerce.controller;

import com.mhamed.ecommerce.model.Product;
import com.mhamed.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> products = new ArrayList<>();

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getTheAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        for(Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
            }
            return "✅ Product deleted successfully!";
        }
        return "❌ Product not found!";
    }


}

