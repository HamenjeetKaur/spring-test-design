package com.example.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogN {
    @GetMapping("/login")
    public String loginpage(){
        return "LogIn";
    }
}