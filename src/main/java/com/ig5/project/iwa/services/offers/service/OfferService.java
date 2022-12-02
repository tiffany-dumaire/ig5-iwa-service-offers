package com.ig5.project.iwa.services.offers.service;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import com.ig5.project.iwa.services.offers.jpa.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    /**
     * Récupération liste des offres
     * @return
     */
    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    /**
     * Récupération offre par id
     * @param offer_id
     * @return
     */
    public Optional<Offer> getById(int offer_id) {
        return offerRepository.findByOfferid(offer_id);
    }

    /**
     * Liste d'offres par titre
     * @param title
     * @return
     */
    public List<Offer> findByTitleContains(String title) {
        return offerRepository.findByTitleContains(title);
    }

    /**
     * Liste des offres par titre et/ou description
     * @param title
     * @param description
     * @return
     */
    public List<Offer> findByTitleContainsOrDescriptionContains(String title, String description) {
        return offerRepository.findByTitleContainsOrDescriptionContains(title, description);
    }

    /**
     * Création d'une offre
     * @param newOffer
     * @return
     */
    public Offer save(Offer newOffer) {
        return offerRepository.save(newOffer);
    }

    /**
     * Update d'une offre
     * @param closeat
     * @return
     */
    public int updateCloseatByOfferid(Date closeat, int offer_id) {
        return offerRepository.updateCloseatByOfferid(closeat, offer_id);
    }

    /**
     * Modifie une offre encore en brouillon
     * @param title
     * @param description
     * @param openat
     * @return
     */
    public int updateTitleAndDescriptionAndOpenatByOfferid(String title, String description, Date openat, int offer_id) {
        return offerRepository.updateTitleAndDescriptionAndOpenatByOfferid(title, description, openat, offer_id);
    }
}