package com.example.aaaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "index.html"; // Looks for index.html in src/main/resources/templates/ or static/
    }
}