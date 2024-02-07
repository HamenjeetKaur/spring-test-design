package com.example.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contact {
    @GetMapping("/contact")
    public String contactpage(){
        return "Contact";
    }
}