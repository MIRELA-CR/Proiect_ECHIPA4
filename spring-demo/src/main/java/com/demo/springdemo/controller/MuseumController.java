package com.demo.springdemo.controller;

import com.demo.springdemo.dto.CityDto;
import com.demo.springdemo.dto.MuseumDto;
import com.demo.springdemo.model.City;
import com.demo.springdemo.model.Museum;
import com.demo.springdemo.service.CityService;
import com.demo.springdemo.service.MuseumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MuseumController {
    @Autowired
    MuseumService museumService;

    @Autowired
    CityService cityService;

    @GetMapping(value = "/Museum")
    public String initM(Model model){


        List<MuseumDto> museumList = museumService.getAllMuseums();
        model.addAttribute("museumList", museumList);

        return "Museum";
    }
    @GetMapping(value = "/FormM")
    public String initFM(Model model){
        Museum museum = new Museum();
        model.addAttribute("museum", museum);

        List<CityDto> cityList = cityService.getAllCities();
        model.addAttribute("cityList", cityList);

        return "FormM";
    }

    @PostMapping(value = "/submitM")
    public String submitM(@ModelAttribute Museum museum,Model model){
        System.out.println("Museum added!");
        museumService.saveMuseum(museum);
        return "redirect:/Museum";
    }

    @PostMapping(value= "/editM")
    public  String editM(@RequestParam("museumId") int id, Model model){
        Museum museum = museumService.getMuseumById(id);
        model.addAttribute("museum",museum);

        List<CityDto> cityList = cityService.getAllCities();
        model.addAttribute("cityList",cityList);
        return "FormM";
    }
    @PostMapping(value = "/deleteM")
    public String deleteM(@RequestParam("museumId") int id){
        museumService.deleteMuseum(id);
        return "redirect:/Museum";
    }
}
