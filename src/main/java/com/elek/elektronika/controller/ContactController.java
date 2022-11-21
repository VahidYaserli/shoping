package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @GetMapping
    public String showContact() {
        return "contact";

    }
    
      @GetMapping("/home/contact")
    public String hShowContact() {
        return "contact";

    }
    
      @GetMapping("/accessories/contact")
    public String accShowContact() {
        return "contact";

    }
  
        @GetMapping("/shop_all/contact")
    public String shShowContact() {
        return "contact";

    }
        @GetMapping("/mobil/contact")
    public String mShowContact() {
        return "contact";

    }
    
        @GetMapping("/about/contact")
    public String abShowContact() {
        return "contact";

    }
    
    
}
