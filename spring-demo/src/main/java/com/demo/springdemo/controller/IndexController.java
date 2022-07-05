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

    @GetMapping(value = "/FormC")
    public String initFC(Model model){
        City city = new City();
        model.addAttribute("city", city);
        return "FormC";
    }

    @PostMapping(value = "/submitC")
    public String submitC(@ModelAttribute City city){
        System.out.println("City added!");
        saveCity(city);
        return "Index";
    }

    private void saveCity(City city) {

    }

    @GetMapping(value = "/FormM")
    public String initFM(Model model){
        Museum museum = new Museum();
        model.addAttribute("museum", museum);
        return "FormM";
    }

    @PostMapping(value = "/submitM")
    public String submitC(@ModelAttribute Museum museum){
        System.out.println("Museum added!");
        saveMuseum(museum);
        return "Index";
    }

    private void saveMuseum(Museum museum) {
    }


}
