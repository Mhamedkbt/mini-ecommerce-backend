package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



}
