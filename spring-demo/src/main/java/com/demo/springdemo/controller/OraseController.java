package com.demo.springdemo.controller;

import com.demo.springdemo.model.Orase;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class OraseController {
    @GetMapping(value = "/Orase")
    public String initO(Model model){

        List<Orase> listaOrase = List.of(
                new Orase("Paris","France", 297),
                new Orase("Moscow","Russia", 261),
                new Orase("Los Angeles","USA", 219),
                new Orase("Seoul","South Korea", 201),
                new Orase("London","UK", 192),
                new Orase("Washington DC","USA", 74),
                new Orase("Beijing","China", 51)
        );
        model.addAttribute("listaOrase", listaOrase);
        return "Orase";
    }
}
