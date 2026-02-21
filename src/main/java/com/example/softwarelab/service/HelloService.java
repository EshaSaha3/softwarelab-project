package com.example.softwarelab.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello Software Lab!";
    }
}