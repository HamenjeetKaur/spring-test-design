package com.example.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class About {
    @GetMapping("/about")
    public String aboutpage(){
        return "About";
    }
}
