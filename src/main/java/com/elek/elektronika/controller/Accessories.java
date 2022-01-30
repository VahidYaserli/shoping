package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accessories")
public class Accessories {

    @GetMapping("/")
    public String showAccessories() {
        return "accessories";
    }
}
