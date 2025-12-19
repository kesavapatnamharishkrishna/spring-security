package com.harish.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	@GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint.";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello, User!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, Admin!";

    }
}
