package com.demo.springdemo.controller;

import com.demo.springdemo.model.Muzee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MuzeeController {

    @GetMapping(value = "/Muzee")
    public String initM(Model model){

        List<Muzee> listaMuzee = List.of(
                new Muzee("Louvre Museum", "Rue de Rivoli 75001", 9334000, "Art", "Paris"  ),
                new Muzee("Smithsonian Museum", "10th St. & Constitution Ave.", 8000000, "Natural History", "Washington DC" ),
                new Muzee("National Museum of China", "16 E Chang'an St", 7450000, "History", "Beijing"),
                new Muzee("National Air and Space Museum", "655 Jefferson Drive", 6970000, "Science", "Washington DC"),
                new Muzee("British Museum", "Great Russell St", 6701000, "History", "London"),
                new Muzee("Rodin Museum", "77 Rue de Varenne 75007", 700000, "Sculpture", "Paris")
        );
        model.addAttribute("listaMuzee", listaMuzee);
        return "Muzee";
    }

}
