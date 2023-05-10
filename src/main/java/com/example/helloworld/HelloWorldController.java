package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {

    @GetMapping("/time")
    public LocalDateTime now() {
        LocalDateTime now = LocalDateTime.now();
        return now;
    }

    @GetMapping("/hello")
    public String hello() {

        return "hello world";
    }
}
