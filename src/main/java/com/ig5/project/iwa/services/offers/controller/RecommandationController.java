package com.ig5.project.iwa.services.offers.controller;

import com.ig5.project.iwa.services.offers.jpa.entity.Recommandation;
import com.ig5.project.iwa.services.offers.service.RecommandationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommandationController {
    @Autowired
    private final RecommandationService recommandationService;

    RecommandationController(RecommandationService recommandationService) { this.recommandationService = recommandationService; }

    @GetMapping("")
    public List<Recommandation> getAllRecommendations() {
        return recommandationService.getAll();
    }

    @GetMapping("/byUser/{id}")
    public List<Recommandation> getRecommendationsByUser(@PathVariable("id") int user_id) {
        return recommandationService.getRecommandationByUserId(user_id);
    }

    @PostMapping("")
    public Recommandation createRecommandation(@RequestBody Recommandation recommandation) {
        return recommandationService.createRecommandation(recommandation);
    }
}
