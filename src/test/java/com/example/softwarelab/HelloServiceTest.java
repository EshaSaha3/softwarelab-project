package com.example.softwarelab;

import com.example.softwarelab.service.HelloService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {

    @Test
    void testGetMessage() {
        HelloService service = new HelloService();
        String result = service.getMessage();
        assertEquals("Hello Software Lab!", result);
    }
}