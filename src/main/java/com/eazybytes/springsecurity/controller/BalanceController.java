package com.eazybytes.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public ResponseEntity<String> getBalance() {
        return ResponseEntity.ok("This is my balance.");
    }

}
