package com.davidmaisuradze.ums.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;
    @Column(name = "credit")
    private int credit;
    @Column(name = "semester")
    private int semester;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    @ManyToOne
    @JoinColumn(name = "lecturer_id")
    private Lecturer lecturer;

    public Subject() {

    }
    public Subject(String subjectName, int credit, int semester) {
        this.subjectName = subjectName;
        this.credit = credit;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
