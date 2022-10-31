package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping("/home")
    public String exchange() {
        return "home";
    }

    @GetMapping("/result")
    public String save(@RequestParam(required=false,name = "condiment") String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);

        return "result";
    }
}



