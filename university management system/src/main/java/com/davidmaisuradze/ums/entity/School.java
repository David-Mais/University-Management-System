package com.davidmaisuradze.ums.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "school_name", nullable = false)
    private String schoolName;

    @Column(name = "semesters_to_finish")
    private int semestersToFinish;

    @Column(name = "field")
    private String field;

    @Column(name = "syllabus")
    private String syllabus;

    @Column(name = "fee")
    private double fee;

    @ManyToOne
    @JoinColumn(name = "head_id")
    private HeadOfDepartment headOfDepartment;

    @OneToMany(mappedBy = "school")
    private List<Subject> subjects;

    public School() {

    }

    public School(String schoolName, int semestersToFinish, String field, String syllabus, double fee) {
        this.schoolName = schoolName;
        this.semestersToFinish = semestersToFinish;
        this.field = field;
        this.syllabus = syllabus;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSemestersToFinish() {
        return semestersToFinish;
    }

    public void setSemestersToFinish(int semestersToFinish) {
        this.semestersToFinish = semestersToFinish;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public HeadOfDepartment getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
