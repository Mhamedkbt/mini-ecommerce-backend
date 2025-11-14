package com.mhamed.ecommerce.service;

import com.mhamed.ecommerce.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



}
