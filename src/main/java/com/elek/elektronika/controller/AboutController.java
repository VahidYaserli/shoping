package com.elek.elektronika.controller;

import com.elek.elektronika.model.AboutDto;
import com.elek.elektronika.model.TeamDto;
import com.elek.elektronika.service.AboutService;
import com.elek.elektronika.service.TeamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {

    @Autowired
    AboutService aboutService;
    @Autowired
    TeamService teamService;
    
    @GetMapping({"","/","a"})
    public String sAbout(Model model) {
        List<AboutDto> list = aboutService.getAllAbout();
        List<TeamDto> timlist= teamService.getAllTeam();
        model.addAttribute("abt", list);
        model.addAttribute("teamabo", timlist);
        
        return "about";
    }

//    @GetMapping
//    public String showAbout("/about/") {
//        return "about";
//    }

    @GetMapping("/accessories/about/a")
    public String accShowAbout() {
        return "about";
    }

    @GetMapping("/contact/about/a")
    public String cShowAbout() {
        return "about";
    }

    @GetMapping("/home/about/a")
    public String hShowAbout() {
        return "about";
    }

    @GetMapping("/mobil/about/")
    public String mShowAbout() {
        return "about";
    }

    @GetMapping("/shop_all/about/")
    public String shShowAbout() {
        return "about";
    }

    @GetMapping("/tablets/about/")
    public String tShowAbout() {
        return "about";
    }

}
