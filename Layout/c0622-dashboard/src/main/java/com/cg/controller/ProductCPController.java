package com.cg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductCPController {
    @RequestMapping("/cp/productlist")
    @GetMapping
    public ModelAndView showProductList() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("cp/product/list");
        return modelAndView;
    }

    @RequestMapping("/cp/productedit")
    @GetMapping
    public ModelAndView showProductEdit() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cp/product/edit");

        return modelAndView;
    }
    @RequestMapping("/cp/productdetail")
    @GetMapping
    public ModelAndView showProductDetail() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cp/product/detail");

        return modelAndView;
    }
    @RequestMapping("/cp/productcart")
        @GetMapping
    public ModelAndView showProductCart() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cp/product/cart");

        return modelAndView;
    }
}
