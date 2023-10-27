package com.davidmaisuradze.ums;

import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityManagementSystemApplication{

    public static void main(String[] args) {
        SpringApplication.run(UniversityManagementSystemApplication.class, args);
    }

//    @Autowired
//    private StudentRepository studentRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        Student student1 = new Student("Davit", "Maisuradze", "20/09/2004", "Male", "addr", "email", "MyRealPhone", "3.0");
//        Student student2 = new Student("Mariam", "Katamashvili", "20/09/2004", "Female", "addr", "email", "MyRealPhone", "3.5");
//        Student student3 = new Student("MIkheil", "Chartolani", "20/09/2004", "Male", "addr", "email", "MyRealPhone", "3.6");
//
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
//    }

}
