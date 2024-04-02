package com.jenkins.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {

    @GetMapping("/say")
    public String sayHello(){
        return "Hai how are you";
    }
}
