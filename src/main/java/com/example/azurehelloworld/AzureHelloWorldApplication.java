package com.example.azurehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureHelloWorldApplication.class, args);
    }


    @GetMapping("/")
    public String getHome() {
        return "<h1>Hello from Azure Hello World - Spring boot app!";
    }
}
