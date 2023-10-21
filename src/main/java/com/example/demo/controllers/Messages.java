package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Messages {

    @GetMapping("/message")
    public ResponseEntity<List<String>> sendMessages(){
        return ResponseEntity.ok(Arrays.asList("username:mohamed","password:123456"));
    }
}