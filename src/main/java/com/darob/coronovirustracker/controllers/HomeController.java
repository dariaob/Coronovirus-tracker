package com.darob.coronovirustracker.controllers;

import com.darob.coronovirustracker.services.CoronavirusDataService;
import models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronavirusDataService coronavirusDataService;

    @GetMapping(path = "/")
    public String home(Model model) {
        List<LocationStats> allStates = coronavirusDataService.getAllStates();
        int totalReportedCases = allStates.stream().mapToInt(stat -> stat.getCasesTotal()).sum();
        int totalNewCases = allStates.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStates);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}
