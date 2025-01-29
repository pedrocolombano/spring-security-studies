package com.eazybytes.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticeController {

    @GetMapping
    public ResponseEntity<String> getNotices() {
        return ResponseEntity.ok("This is the notice");
    }
}
