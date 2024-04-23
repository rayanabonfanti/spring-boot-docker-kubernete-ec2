package com.ec2.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {


    @GetMapping()
    public String getHelloWorld() {
        return "Hello World!";
    }

}
