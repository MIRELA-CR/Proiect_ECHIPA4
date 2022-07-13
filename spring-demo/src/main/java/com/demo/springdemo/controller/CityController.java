package com.demo.springdemo.controller;

import com.demo.springdemo.dto.CityDto;
import com.demo.springdemo.model.City;
import com.demo.springdemo.service.CityService;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping(value = "/City")
    public String initC(Model model){


        List<CityDto> cityList = cityService.getAllCities();
        model.addAttribute("cityList", cityList);

        return "City";
    }
    @GetMapping(value = "/FormC")
    public String initFC(Model model){
        City city = new City();
        model.addAttribute("city", city);
        return "FormC";
    }

    @PostMapping(value = "/submitC")
    public String submitC(@ModelAttribute City city, Model model){
        System.out.println("City added!");
        cityService.saveCity(city);
        return "redirect:/City";
    }

    @PostMapping(value = "/editC")
    public String editC(@RequestParam("cityId") int id, Model model){
        City city = cityService.getCityById(id);
        model.addAttribute("city", city);

        return "FormC";
    }

    @PostMapping(value = "/deleteC")
    public String deleteC(@RequestParam("cityId") int id){
        cityService.deleteCity(id);
        return "redirect:/City";
    }

}
