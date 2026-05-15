package com.aiadaptive.Controller;




import com.aiadaptive.domain.Recommendation;
import com.aiadaptive.services.RecommendationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    private final RecommendationService service;


    public RecommendationController(RecommendationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Recommendation> getAll() {
        return service.getAllRecommendations();
    }

    @PostMapping
    public Recommendation create(@RequestBody Recommendation rec) {
        return service.createRecommendation(rec);
    }
}