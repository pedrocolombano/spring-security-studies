package com.eazybytes.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public ResponseEntity<String> getContact() {
        return ResponseEntity.ok("Company contact.");
    }

}
