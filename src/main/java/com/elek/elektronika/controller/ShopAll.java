package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop_all")
public class ShopAll {

    @GetMapping
    public String showShopAll() {
        return "shop_all";
    }
     @GetMapping("/about/shop_all")
    public String abShowShopAll() {
        return "shop_all";
    }
     @GetMapping("/accessories/shop_all")
    public String accShowShopAll() {
        return "shop_all";
    }
     @GetMapping("/contact/shop_all")
    public String cShowShopAll() {
        return "shop_all";
    }
     @GetMapping("/home/shop_all")
    public String hShowShopAll() {
        return "shop_all";
    }
     @GetMapping("/mobil/shop_all")
    public String mShowShopAll() {
        return "shop_all";
    }
     @GetMapping("/tablets/shop_all")
    public String tShowShopAll() {
        return "shop_all";
    }
    
    
}
