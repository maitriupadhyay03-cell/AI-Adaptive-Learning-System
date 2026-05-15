package com.aiadaptive.repositories.inMemory;

import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    private final Map<String, Student> storage = new HashMap<>();

    @Override
    public Student save(Student student) {
        storage.put(student.getId(), student);
        return student;
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}