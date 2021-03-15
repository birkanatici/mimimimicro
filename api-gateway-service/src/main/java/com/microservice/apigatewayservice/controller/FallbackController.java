package com.microservice.apigatewayservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController
{
    @GetMapping("/service-a")
    public ResponseEntity<String> serviceAFallback()
    {
        return new ResponseEntity<>("Service A is not available at the moment", HttpStatus.GONE);
    }

    @GetMapping("/service-b")
    public ResponseEntity<String> serviceBFallback()
    {
        return new ResponseEntity<>("Service B is not available at the moment", HttpStatus.GONE);
    }
}
