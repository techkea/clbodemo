package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Hello world";
    }

    @GetMapping("/about")
    public String about(){
        return "About";
    }
}
