package com.example.springtest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class One {
    @GetMapping("/")
    public String homepage(){
        return "Home";
    }
}
