package com.demo.springdemo.controller;

import com.demo.springdemo.model.Muzeu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(Model model){

        String text = "Hello from Spring Controller";
        model.addAttribute("greetings", text);
        model.addAttribute("mytext", "Hello again!!");

        List<String> orase = List.of("oras1", "oras2", "oras3", "oras4");
        model.addAttribute("orase", orase);

        List<Muzeu> listaMuzee = List.of(
                new Muzeu("p", 0, "2"),
                new Muzeu("a", 5, "f"),
                new Muzeu("w", 7, "bh"),
                new Muzeu("b", 7, "gj")
        );
        model.addAttribute("listaMuzee", listaMuzee);

        return "index";
    }
}
