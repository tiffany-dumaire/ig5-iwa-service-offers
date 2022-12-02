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

    /**
     * Route : /api/recommendations | Récupération de la liste complète des recommandations
     * @return
     */
    @GetMapping("")
    public List<Recommandation> getAllRecommendations() {
        return recommandationService.getAll();
    }

    /**
     * Route : /api/recommendations/byUser/{id} | Récupération de la liste des recommandations par user
     * @param user_id
     * @return
     */
    @GetMapping("/byUser/{id}")
    public List<Recommandation> getRecommendationsByUser(@PathVariable("id") int user_id) {
        return recommandationService.getRecommandationByUserId(user_id);
    }

    /**
     * Route : /api/recommendations | Création d'une recommandation
     * @param recommandation
     * @return
     */
    @PostMapping("")
    public Recommandation createRecommandation(@RequestBody Recommandation recommandation) {
        return recommandationService.createRecommandation(recommandation);
    }
}
