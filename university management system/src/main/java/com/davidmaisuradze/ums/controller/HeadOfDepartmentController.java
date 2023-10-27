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
public class HeadOfDepartmentController {
    private StudentService studentService;

    public HeadOfDepartmentController(StudentService studentService) {
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

    @GetMapping("/headofdepartment/edit/{id}")
    public String editStudentForm(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "updatestudent";
    }

    @PostMapping("/headofdepartment/{id}")
    public String updateStudent(@PathVariable int id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setDateOfBirth(student.getDateOfBirth());
        existingStudent.setGender(student.getGender());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhoneNumber(student.getPhoneNumber());
        existingStudent.setGpa(student.getGpa());

        studentService.updateStudent(existingStudent);
        return "redirect:/headofdepartment";
    }
    @GetMapping("/headofdepartment/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudentById(id);
        return "redirect:/headofdepartment";
    }
}
