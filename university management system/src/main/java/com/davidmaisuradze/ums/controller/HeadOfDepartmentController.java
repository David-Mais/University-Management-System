package com.davidmaisuradze.ums.controller;

import com.davidmaisuradze.ums.entity.School;
import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.service.HeadOfDepartmentService;
import com.davidmaisuradze.ums.service.SchoolService;
import com.davidmaisuradze.ums.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HeadOfDepartmentController {
    private StudentService studentService;
    private SchoolService schoolService;
    private HeadOfDepartmentService headOfDepartmentService;

    public HeadOfDepartmentController(StudentService studentService, SchoolService schoolService, HeadOfDepartmentService headOfDepartmentService) {
        this.studentService = studentService;
        this.schoolService = schoolService;
        this.headOfDepartmentService = headOfDepartmentService;
    }

    @GetMapping("/headofdepartment")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "headofdepartment";
    }

    @GetMapping("/headofdepartment/new")
    public String createStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("schools", schoolService.getAllSchool());
        model.addAttribute("student", student);
        return "createstudent";
    }
    @PostMapping("headofdepartment")
    public String saveNewStudent(@ModelAttribute("student") Student student, @RequestParam("school") int schoolId) {
        School school = schoolService.getSchoolById(schoolId);
        student.setSchool(school);
        studentService.saveStudent(student);
        return "redirect:/headofdepartment";
    }

    @GetMapping("/headofdepartment/edit/{id}")
    public String editStudentForm(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("schools", schoolService.getAllSchool());
        return "updatestudent";
    }

    @PostMapping("/headofdepartment/{id}")
    public String updateStudent(@PathVariable int id,
                                @ModelAttribute("student") Student student,
                                @RequestParam("school") int schoolId,
                                Model model) {

        School school = schoolService.getSchoolById(schoolId);
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
        existingStudent.setSchool(school);
        studentService.updateStudent(existingStudent);
        return "redirect:/headofdepartment";
    }
    @GetMapping("/headofdepartment/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudentById(id);
        return "redirect:/headofdepartment";
    }

    @GetMapping("/headofdepartments")
    public String headsOfDepartments(Model model) {
        model.addAttribute("hods", headOfDepartmentService.getAllHeadOfDepartment());
        return "headofdepartments";
    }
}
