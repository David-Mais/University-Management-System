package com.davidmaisuradze.ums.service;

import com.davidmaisuradze.ums.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(int id);
    Student updateStudent(Student student);

    void deleteStudentById(int id);
}