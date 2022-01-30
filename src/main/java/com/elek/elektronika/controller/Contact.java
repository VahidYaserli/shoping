package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class Contact {

    @GetMapping("/")
    public String showContact() {
        return "contact";

    }
    
    @GetMapping("/home")
    public String showContactHome() {
        return "home";

    }
}
