package com.example.Students.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    // ================= Fields =================

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String course;

    private LocalDate enrollmentDate;

    // ================= Constructors =================

    // No-arg constructor (required by JPA)
    public Student() {
    }

    // Constructor without id
    public Student(String name, String email, String course, LocalDate enrollmentDate) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // Constructor with id
    public Student(Long id, String name, String email, String course, LocalDate enrollmentDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // ================= Getters & Setters =================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }
 
    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }
 
    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // ================= toString() =================

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }
}

