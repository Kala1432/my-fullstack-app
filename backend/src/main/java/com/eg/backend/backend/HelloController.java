
package com.eg.backend.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/bk")
    public String home() {
        return "Backend is working with the hello endpoint 🚀";
    }
}