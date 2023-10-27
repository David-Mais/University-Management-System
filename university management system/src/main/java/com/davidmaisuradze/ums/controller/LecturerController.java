package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LecturerController {
    private StudentService studentService;
    public LecturerController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/lecturer")
    public String listStudentInSubject(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "lecturer";
    }

    @GetMapping("/lecturer/edit/{id}")
    public String editStudentGrade(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "changegrade";
    }

    @PostMapping("/lecturer/{id}")
    public String updateGrades(@PathVariable int id,
                               @ModelAttribute("student") Student student,
                               Model model) {
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setHomework(student.getHomework());
        existingStudent.setQuiz(student.getQuiz());
        existingStudent.setExam(student.getExam());
        studentService.updateStudent(existingStudent);
        return "redirect:/lecturer";
    }

}
