package com.anchal.developindia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {
    @GetMapping("/")
    public String startapp(){
        return "hello";
    }
}
