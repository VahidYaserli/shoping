package com.elek.elektronika.controller;

import com.elek.elektronika.model.AccessoriesDto;
import com.elek.elektronika.model.MobilDto;
import com.elek.elektronika.model.TabletDto;
import com.elek.elektronika.service.ProductsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop_all")
public class ShopAll {

    @Autowired
    ProductsService productsService;

    @GetMapping
    public String showShopAll(Model model) {
        List<MobilDto> list1 = productsService.getAllMobil();
        List<TabletDto> list2 = productsService.getAllTablet();
        List<AccessoriesDto> list3 = productsService.getAllAccessories();
        model.addAttribute("showa", list1);
        model.addAttribute("showb", list2);
        model.addAttribute("showc", list3);
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
