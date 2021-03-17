package com.microservice.serviceb.controller;

import static java.time.Instant.now;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/service-b")
public class GreetingController
{
    @GetMapping("/hey")
    public ResponseEntity<String> hey()
    {
        log.info("Request came.");

        return new ResponseEntity<>(String.format("Hello from Service B. %n%nTime : %s", now()), HttpStatus.OK);
    }
}
