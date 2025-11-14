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

    public Product getTheProductById(Integer id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void insertProduct(Product product) {
        productRepository.save(product);
    }


    public void deleteTheProductById(int id) {
        productRepository.deleteById(id);
    }

    public Product updateTheProduct(int id, Product product) {
        // find product by id
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // update fields
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        // save back
        return productRepository.save(existingProduct);
    }
}
