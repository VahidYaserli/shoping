package com.elek.elektronika.controller;

import com.elek.elektronika.model.TabletDto;
import com.elek.elektronika.service.ProductsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablets")
public class TabletsController {

    @Autowired
    ProductsService productsService;

    @GetMapping
    public String showTablets(Model model) {
        List<TabletDto> liste = productsService.getAllTablet();
        model.addAttribute("tablets", liste);
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
