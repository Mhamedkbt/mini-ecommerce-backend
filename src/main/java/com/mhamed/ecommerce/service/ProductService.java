package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.model.Product;
import com.mhamed.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getTheAllProducts() {
        return productRepository.findAll();
    }


}
