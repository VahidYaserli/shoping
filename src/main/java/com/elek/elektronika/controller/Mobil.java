package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mobil")
public class Mobil {

    @GetMapping
    public String showMobil() {
        return "mobil";

    }
    
     @GetMapping("/about/mobil")
    public String abShowMobil() {
        return "mobil";

    }
     @GetMapping("/accessories/mobil")
    public String accShowMobil() {
        return "mobil";

    }
     @GetMapping("/contact/mobil")
    public String cShowMobil() {
        return "mobil";

    }
     @GetMapping("/home/mobil")
    public String mShowMobil() {
        return "mobil";

    }
     @GetMapping("/shop_all/mobil")
    public String shShowMobil() {
        return "mobil";

    }
     @GetMapping("/tablets/mobil")
    public String tShowMobil() {
        return "mobil";

    }
    
    
    
    
    
    

}
