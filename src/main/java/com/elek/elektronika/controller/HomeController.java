
package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping
    public String showHome(){
    return "home" ;
    }
    
    @GetMapping("/about/home")
    public String hShowHome(){
    return "home" ;
    }
    @GetMapping("/accessories/home")
    public String accShowHome(){
    return "home" ;
    }
    @GetMapping("/contact/home")
    public String cShowHome(){
    return "home" ;
    }
    @GetMapping("/mobil/home")
    public String mShowHome(){
    return "home" ;
    }
    @GetMapping("/shop_all/home")
    public String shShowHome(){
    return "home" ;
    }
    @GetMapping("/tablets/home")
    public String tShowHome(){
    return "home" ;
    }
    
    
    
}
