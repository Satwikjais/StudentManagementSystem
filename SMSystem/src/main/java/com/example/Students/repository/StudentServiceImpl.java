package com.example.Students.repository;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Students.entity.Student;
import com.example.Students.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setEnrollmentDate(student.getEnrollmentDate());

        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentsByCourse(String course) {
        return studentRepository.findByCourse(course);
    }

    @Override
    public List<Student> searchStudentsByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
}

