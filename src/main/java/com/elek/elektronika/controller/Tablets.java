package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablets")
public class Tablets {

    @GetMapping("/")
    public String showTablets() {
        return "tablets";

    }

}
