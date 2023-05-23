package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/greetings")
    public String greetings(@RequestParam(defaultValue = "world") String name) {
        return "hello,%s!".formatted(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
