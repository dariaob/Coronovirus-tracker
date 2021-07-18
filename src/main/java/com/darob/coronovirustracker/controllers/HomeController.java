package com.darob.coronovirustracker.controllers;

import com.darob.coronovirustracker.services.CoronavirusDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    CoronavirusDataService coronavirusDataService;

    @GetMapping(path = "/")
    public String home(Model model) {
        model.addAttribute("locationStats", coronavirusDataService.getAllStates());
        return "home";
    }
}
