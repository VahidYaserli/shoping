package com.elek.elektronika.controller;

import java.util.List;
import com.elek.elektronika.model.MobilDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.elek.elektronika.service.ProductsService;

@Controller
@RequestMapping("/mobil")
public class MobilController {

    @Autowired
    ProductsService productsService;

    @GetMapping({"/","","/tele"})
    public String showSmartPhone(Model model) {

        List<MobilDto> list = productsService.getAllMobil();
        model.addAttribute("mobiles", list);
        return "mobil";
    }

//    @GetMapping
//    public String showMobil() {
//        return "mobil";
//
//    }

    @GetMapping("about/mobil")
    public String abShowMobil() {
        return "mobil";

    }

    @GetMapping("accessories/mobil")
    public String accShowMobil() {
        return "mobil";

    }

    @GetMapping("/contact/mobil")
    public String cShowMobil() {
        return "mobil";

    }

    @GetMapping("home/mobil/tele")
    public String mShowMobil() {
        return "mobil";

    }

    @GetMapping("shop_all/mobil/tele")
    public String shShowMobil() {
        return "mobil";

    }

    @GetMapping("tablets/mobil/tele")
    public String tShowMobil() {
        return "mobil";

    }

}
