package com.example.softwarelab.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    // HelloService.java
    public String getMessage() {
        return "Hello Software Lab! [Updated]"; // add [Updated] or any small text
    }
}