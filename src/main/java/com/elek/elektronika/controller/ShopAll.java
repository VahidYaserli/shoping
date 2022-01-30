package com.elek.elektronika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopAll")
public class ShopAll {

    @GetMapping("/")
    public String showShopAll() {
        return "shop_all";
    }
}
