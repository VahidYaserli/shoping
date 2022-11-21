package com.elek.elektronika.controller;

import com.elek.elektronika.model.AccessoriesDto;
import com.elek.elektronika.service.ProductsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accessories")
public class AccessoriesController {
    
    @Autowired
    ProductsService productsService;

    @GetMapping
    public String showAccessories( Model model) {
        
        List<AccessoriesDto> list = productsService.getAllAccessories();
        model.addAttribute("accessories", list);
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
