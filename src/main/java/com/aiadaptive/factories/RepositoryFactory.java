package com.aiadaptive.factories;


import com.aiadaptive.repositories.StudentRepository;
import com.aiadaptive.repositories.inMemory.InMemoryStudentRepository;


public class RepositoryFactory {

    public static StudentRepository getStudentRepository(String type) {

        return switch (type.toUpperCase()) {
            case "MEMORY" -> new InMemoryStudentRepository();
            case "DATABASE" -> throw new UnsupportedOperationException("Database not implemented yet");
            default -> throw new IllegalArgumentException("Invalid repository type");
        };
    }
}
