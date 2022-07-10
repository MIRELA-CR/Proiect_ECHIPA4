package com.demo.springdemo.controller;

import com.demo.springdemo.model.City;
import com.demo.springdemo.model.Museum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/Index")
    public String index(Model model){
        return "Index";
    }

}
