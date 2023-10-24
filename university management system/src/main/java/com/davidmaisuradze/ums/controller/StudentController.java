package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @GetMapping("/headofdepartment")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "headofdepartment";
    }
}
