package com.iago.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hola Iago! Tu microservicio Java está corriendo en ECS detrás del ALB.";
    }
}