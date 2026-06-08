package com.iago.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/users")
    public String users() {
        return "iago-users v1.0.0";
    }
}

