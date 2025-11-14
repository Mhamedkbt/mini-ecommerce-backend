package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.model.Product;
import com.mhamed.ecommerce.repository.ProductRepository;

import java.util.List;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


}
