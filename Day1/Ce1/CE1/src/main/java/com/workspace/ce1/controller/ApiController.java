package com.workspace.ce1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/welcome")
    public static String display()
    {
       return "Welcome Spring Boot!";
    }
}
