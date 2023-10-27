package com.davidmaisuradze.ums.controller;


import com.davidmaisuradze.ums.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/{id}")
    public String showStudentInfo(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "student";
    }
}
