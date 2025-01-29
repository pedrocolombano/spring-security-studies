package com.eazybytes.springsecurity.controller;

import com.eazybytes.springsecurity.model.entity.Customer;
import com.eazybytes.springsecurity.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final PasswordEncoder passwordEncoder;
    private final CustomerRepository customerRepository;

    @PostMapping("/register")
    public ResponseEntity<String> create(@RequestBody Customer customer) {
        String hashPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(hashPassword);

        customerRepository.save(customer);

        return ResponseEntity.ok("Customer created");
    }

}
