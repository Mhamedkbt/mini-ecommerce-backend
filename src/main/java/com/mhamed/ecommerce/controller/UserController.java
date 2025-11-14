package com.mhamed.ecommerce.controller;

import com.mhamed.ecommerce.model.User;
import com.mhamed.ecommerce.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    List<User> users = new ArrayList<>();

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getTheAllUsers();
    }

    @PostMapping
    public void addNewUser(User user) {
        userService.insertUser(user);
    }

//    @PostMapping
//    public User addUser(@RequestBody User user) {
//        users.add(user);
//        return user;
//    }

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
