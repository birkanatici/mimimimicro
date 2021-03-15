package com.microservice.servicea.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-a")
public class GreetingController
{
    @GetMapping("/hey")
    public ResponseEntity<String> hey()
    {
        return new ResponseEntity<>("Hello from Service A.", HttpStatus.OK);
    }
}
