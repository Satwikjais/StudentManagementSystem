package com.example.Students.service;

import java.util.List;
import com.example.Students.entity.Student;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> getStudentsByCourse(String course);

    List<Student> searchStudentsByName(String name);
}

