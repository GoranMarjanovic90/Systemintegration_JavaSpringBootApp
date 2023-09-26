package com.example.javaspringbootapp.controller;

import com.example.javaspringbootapp.models.Temperatur;
import com.example.javaspringbootapp.repositories.TemperaturRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemperatureController {

    @Autowired
    private TemperaturRepo temprepo;

    @GetMapping("/temperatures")
    public String showTemperatures(Model model) {

        List<Temperatur> temperatures = temprepo.findAll();

        model.addAttribute("temperatures", temperatures);

        return "index";
    }
}
