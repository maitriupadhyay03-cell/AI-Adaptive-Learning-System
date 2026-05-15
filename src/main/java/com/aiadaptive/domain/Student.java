package com.aiadaptive.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Student {

    private final String id;
    @Setter
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

}