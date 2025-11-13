package com.mhamed.ecommerce.controller;

import com.mhamed.ecommerce.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    List<User> users = new ArrayList<>();

    public UserController() {
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        for (User u : users) {
            if(u.getId() == id) {
                users.remove(u);
                return "✅User deleted successfully!";
            }
        }
        return "❌ User not found!";
    }


}
