package com.aiadaptive.services;



import com.aiadaptive.domain.Recommendation;
import com.aiadaptive.repositories.RecommendationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final RecommendationRepository repo;

    public RecommendationService(RecommendationRepository repo) {
        this.repo = repo;
    }

    public Recommendation createRecommendation(Recommendation rec) {
        return repo.save(rec);
    }

    public List<Recommendation> getAllRecommendations() {
        return repo.findAll();
    }
}