package com.microservice.serviceb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-b")
public class GreetingController
{
    @GetMapping("/hey")
    public ResponseEntity<String> hey()
    {
        return new ResponseEntity<>("Hello from Service B.", HttpStatus.OK);
    }
}
