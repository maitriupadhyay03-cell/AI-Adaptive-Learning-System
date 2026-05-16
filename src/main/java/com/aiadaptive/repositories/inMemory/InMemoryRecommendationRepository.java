package com.aiadaptive.repositories.inMemory;



import com.aiadaptive.domain.Recommendation;
import com.aiadaptive.domain.Student;
import com.aiadaptive.repositories.RecommendationRepository;

import java.util.*;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository

public class InMemoryRecommendationRepository implements RecommendationRepository {

    private final Map<String, Recommendation> storage = new HashMap<>();

    @Override
    public Recommendation save(Recommendation rec) {
        storage.put(rec.getId(), rec);
        return rec;
    }

    @Override
    public Optional<Recommendation> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Recommendation> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}