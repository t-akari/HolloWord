package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public HelloWorldResponse hello() {

        return new HelloWorldResponse("hello word", LocalDateTime.now());
    }

}
