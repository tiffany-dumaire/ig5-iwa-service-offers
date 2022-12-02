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

    public List<Recommandation> getAll() { return recommandationRepository.findAll(); }

    public List<Recommandation> getRecommandationByUserId(int user_id) {
        return recommandationRepository.findByUserid(user_id);
    }

    public Recommandation createRecommandation(Recommandation recommandation) {
        return recommandationRepository.save(recommandation);
    }
}
