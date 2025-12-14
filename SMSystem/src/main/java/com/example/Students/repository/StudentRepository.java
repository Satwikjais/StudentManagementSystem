package com.example.Students.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Fetch students by course
    List<Student> findByCourse(String course);

    // Search students by name (partial match)
    List<Student> findByNameContainingIgnoreCase(String name);
}

