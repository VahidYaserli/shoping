package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablets")
public class Tablets {

    @GetMapping
    public String showTablets() {
        return "tablets";

    }
    
     @GetMapping("/about/tablets")
    public String abShowTablets() {
        return "tablets";

    }
 @GetMapping("/accessories/tablets")
    public String acShowTablets() {
        return "tablets";

    }
 @GetMapping("/contact/tablets")
    public String cShowTablets() {
        return "tablets";

    }
 @GetMapping("home/tablets")
    public String hShowTablets() {
        return "tablets";

    }
 @GetMapping("mobil/tablets")
    public String mShowTablets() {
        return "tablets";

    }
 @GetMapping("shop_all/tablets")
    public String shSowTablets() {
        return "tablets";

    }


}
