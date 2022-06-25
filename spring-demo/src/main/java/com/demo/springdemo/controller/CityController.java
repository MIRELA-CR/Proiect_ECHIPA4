package com.demo.springdemo.controller;

import com.demo.springdemo.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {
    @GetMapping(value = "/City")
    public String initC(Model model){

        List<City> cityList = List.of(
                new City("Paris","France", 297),
                new City("Moscow","Russia", 261),
                new City("Los Angeles","USA", 219),
                new City("Seoul","South Korea", 201),
                new City("London","UK", 192),
                new City("Washington DC","USA", 74),
                new City("Beijing","China", 51)
        );
        model.addAttribute("cityList", cityList);
        return "City";
    }
}
