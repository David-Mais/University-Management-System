package com.davidmaisuradze.ums.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "school_name")
    private String name;
    @Column(name = "semesters_needed", columnDefinition = "INT DEFAULT 0")
    private int semesters;
    @Column(name = "fee", columnDefinition = "INT DEFAULT 0")
    private int fee;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students;
    @OneToOne(mappedBy = "school")
    private HeadOfDepartment headOfDepartment;

    public School() {

    }
    public School(String name, int semesters, int fee) {
        this.name = name;
        this.semesters = semesters;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemesters() {
        return semesters;
    }

    public void setSemesters(int semesters) {
        this.semesters = semesters;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public HeadOfDepartment getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
}
