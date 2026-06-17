package com.iago.users.controller;

import com.iago.users.model.User;
import com.iago.users.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET /users → lista todos los usuarios
    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // POST /users → crea un usuario en la BD
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
