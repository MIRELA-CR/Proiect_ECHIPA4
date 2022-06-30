package com.demo.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FormMController {
    @GetMapping(value = "/FormM")
    public String initFM(Model model) {

        return "FormM";
    }
}
