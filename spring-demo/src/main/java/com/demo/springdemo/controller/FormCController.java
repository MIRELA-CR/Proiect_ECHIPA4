package com.demo.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormCController {
    @GetMapping(value = "/FormC")
    public String initFC(Model model){
        return "FormC";
    }
}
