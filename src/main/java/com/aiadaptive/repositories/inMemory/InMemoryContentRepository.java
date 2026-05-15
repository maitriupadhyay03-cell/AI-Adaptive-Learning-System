package com.aiadaptive.repositories.inMemory;



import com.aiadaptive.domain.Content;
import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.ContentRepository;

import java.util.*;


public class InMemoryContentRepository implements ContentRepository {

        private final Map<String, Content> storage = new HashMap<>();

        @Override
        public Student save(Content content) {
            storage.put(content.getId(), content);
            return content;
        }

        @Override
        public Optional<Content> findById(String id) {
            return Optional.ofNullable(storage.get(id));
        }

        @Override
        public List<Content> findAll() {
            return new ArrayList<>(storage.values());
        }

        @Override
        public void delete(String id) {
            storage.remove(id);
        }
    }

