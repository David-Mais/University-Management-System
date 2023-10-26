package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/headofdepartment/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "createstudent";
    }
    @PostMapping("headofdepartment")
    public String saveNewStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/headofdepartment";
    }
}
