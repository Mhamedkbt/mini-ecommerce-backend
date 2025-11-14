package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.model.Product;
import com.mhamed.ecommerce.model.User;
import com.mhamed.ecommerce.repository.ProductRepository;
import com.mhamed.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public UserService(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public User getTheUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public List<User> getTheAllUsers() {
        return userRepository.findAll();
    }

    public void insertUser(User user) {
        userRepository.save(user);
    }

    public void deleteTheUserById(Integer id) {
         userRepository.deleteById(id);
    }
}
