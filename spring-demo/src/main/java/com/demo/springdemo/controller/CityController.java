package com.demo.springdemo.controller;

import com.demo.springdemo.model.City;
import com.demo.springdemo.repository.CityRepository;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CityController {
    @Autowired

    CityRepository cityRepository;

    @GetMapping(value = "/City")
    public String initC(Model model){

        /*List<City> cityList = List.of(
                new City("Paris","France", 297),
                new City("Moscow","Russia", 261),
                new City("Los Angeles","USA", 219),
                new City("Seoul","South Korea", 201),
                new City("London","UK", 192),
                new City("Tokyo","Japan",173),
                new City("Chengdu", "China",150),
                new City("Amsterdam","The Netherlands",144),
                new City("New York City", "USA",140),
                new City("San Francisco","USA",132),
                new City("Taipei", "Taiwan",131),
                new City("Shanghai","China",120),
                new City("Brussels", "Belgium",93),
                new City("Milan","Italy",90),
                new City("Stockholm","Sweden",90),
                new City("Washington DC","USA", 74),
                new City("Bucharest", "Romania", 60),
                new City("Beijing","China", 51)
        );*/

        List<City> cityList = cityRepository.findAll();
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
    public String submitC(@ModelAttribute City city){
        System.out.println("City added!");
        saveCity(city);
        return "Index";
    }

    private void saveCity(City city) {
        cityRepository.save(city);
    }


}
