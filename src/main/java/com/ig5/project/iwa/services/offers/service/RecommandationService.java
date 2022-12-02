package com.ig5.project.iwa.services.offers.service;

import com.ig5.project.iwa.services.offers.jpa.entity.Recommandation;
import com.ig5.project.iwa.services.offers.jpa.repository.RecommandationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommandationService {
    @Autowired
    RecommandationRepository recommandationRepository;

    /**
     * Récupération de l'ensemble des recommandations
     * @return
     */
    public List<Recommandation> getAll() { return recommandationRepository.findAll(); }

    /**
     * Récupération de la liste des recommandations pour un user donné
     * @param user_id
     * @return
     */
    public List<Recommandation> getRecommandationByUserId(int user_id) {
        return recommandationRepository.findByUserid(user_id);
    }

    /**
     * Création d'une recommandation
     * @param recommandation
     * @return
     */
    public Recommandation createRecommandation(Recommandation recommandation) {
        return recommandationRepository.save(recommandation);
    }
}
