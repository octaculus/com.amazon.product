package com.amazon.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/add-product")
    public String add_product_view(){
        return "add-product";
    }
}
