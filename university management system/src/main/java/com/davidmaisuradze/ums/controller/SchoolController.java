package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.service.SchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/schools")
    public String getAllSchools(Model model) {
        model.addAttribute("schools", schoolService.getAllSchool());
        return "schools";
    }

}
