package com.aiadaptive.repositories;

import com.aiadaptive.domain.Student;

import java.util.*;

public interface Repository<T, ID> {

        T save(T entity);  //  FIXED (returns T)

        Optional<T> findById(ID id);

        List<T> findAll();

        void delete(ID id);
    }

