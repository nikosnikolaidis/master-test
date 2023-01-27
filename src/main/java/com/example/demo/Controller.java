package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class Controller {
    
    @GetMapping(value="/hello")
    public String hello() {
        return "Hello!";
    }
}