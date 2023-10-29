package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.entity.School;
import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.service.SchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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

    @GetMapping("/schools/{id}")
    public String studentsOfSchool(@PathVariable int id, Model model) {
        School school = schoolService.getSchoolById(id);
        List<Student> students = school.getStudents();
        model.addAttribute("students", students);
        model.addAttribute("school", school);
        model.addAttribute("schoolName", school.getName());
        return "schoolstudent";
    }

}
