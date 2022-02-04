package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accessories")
public class Accessories {

    @GetMapping
    public String showAccessories() {
        return "accessories";
    }
    @GetMapping("/home/accessories")
    public String hShowAccessories() {
        return "accessories";
    }
    @GetMapping("/contact/accessories")
    public String cShowAccessories() {
        return "accessories";
    }
    @GetMapping("/about/accessories")
    public String abShowAccessories() {
        return "accessories";
    }
    @GetMapping("/shop_all/accessories")
    public String shShowAccessories() {
        return "accessories";
    }
    @GetMapping("/tablets/accessories")
    public String tShowAccessories() {
        return "accessories";
    }
    @GetMapping("/mobil/accessories")
    public String mShowAccessories() {
        return "accessories";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
