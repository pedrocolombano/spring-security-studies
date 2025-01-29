package com.eazybytes.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/myLoans")
    public ResponseEntity<String> getLoans() {
        return ResponseEntity.ok("These are my loans.");
    }

}
