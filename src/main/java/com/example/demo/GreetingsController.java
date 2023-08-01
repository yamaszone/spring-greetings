package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<Map<String, String>> greet(@RequestParam(required = false) String name) {
        HashMap<String, String> response = new HashMap<>();
        if (name == null || name.trim().isEmpty()) {
            name = "anonymous";
        }
        response.put("message", "Hello, " + name + "!");
        return ResponseEntity.ok(response);
    }
}

