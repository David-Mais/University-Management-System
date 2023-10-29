package com.davidmaisuradze.ums;

import com.davidmaisuradze.ums.entity.HeadOfDepartment;
import com.davidmaisuradze.ums.entity.School;
import com.davidmaisuradze.ums.entity.Student;
import com.davidmaisuradze.ums.repository.HeadOfDepartmentRepository;
import com.davidmaisuradze.ums.repository.SchoolRepository;
import com.davidmaisuradze.ums.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityManagementSystemApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(UniversityManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private HeadOfDepartmentRepository head;
    @Override
    public void run(String... args) throws Exception {

    }

}
