package com.example.core.controller;

import com.example.core.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloController() {
        this.helloService = null;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return helloService.getMessage();
    }
}


