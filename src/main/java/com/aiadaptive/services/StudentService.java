package com.aiadaptive.services;

import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repo;

    // Constructor Injection
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student createStudent(Student student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            throw new RuntimeException("Student name is required");
        }

        return repo.save(student);
    }
}