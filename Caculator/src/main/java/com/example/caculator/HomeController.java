package com.example.caculator;

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
    public String convert(@RequestParam("a") Double a,@RequestParam("b") Double b, Model model) {
            Double result1 = a+b;
            Double result2 = a-b;
            Double result3 = a/b;
            Double result4 = a*b;

        model.addAttribute("a",a);
        model.addAttribute("b",b);

        model.addAttribute("result",result1);
        model.addAttribute("result",result2);
        model.addAttribute("result",result3);
        model.addAttribute("result",result4);


        return "result";
    }
}



