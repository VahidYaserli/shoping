package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {

    @GetMapping
    public String showAbout() {
        return "about";
    }
    
     @GetMapping("/accessories/about")
    public String accShowAbout() {
        return "about";
    }
    
     @GetMapping("/contact/about")
    public String cShowAbout() {
        return "about";
    }
     @GetMapping("/home/about")
    public String hShowAbout() {
        return "about";
    }
     @GetMapping("/mobil/about")
    public String mShowAbout() {
        return "about";
    }
     @GetMapping("/shop_all/about")
    public String shShowAbout() {
        return "about";
    }
     @GetMapping("/tablets/about")
    public String tShowAbout() {
        return "about";
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
