package com.codegym.irregularverbs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api")
    public String testApi(){
        return "hello";
    }
}
