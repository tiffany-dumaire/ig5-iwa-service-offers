package com.ig5.project.iwa.services.offers.controller;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import com.ig5.project.iwa.services.offers.model.OfferUpdate;
import com.ig5.project.iwa.services.offers.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/offers")
public class OfferController {
    @Autowired
    private final OfferService offerService;

    OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    /**
     * Route : /api/offers | Liste des offres existantes
     * @return
     */
    @GetMapping("")
    public List<Offer> getAllOffers() {
        return offerService.getAll();
    }

    /**
     * Route : /api/offers/search/{title} | liste des offres contenant title dans le titre
     * @param title
     * @return
     */
    @GetMapping("/search/{title}")
    public List<Offer> getOffreByTitle(@PathVariable("title") String title) {
        return offerService.findByTitleContains(title);
    }

    /**
     * Route : /api/offers/search/{title}/{description} | liste des offres contenant title dans le titre et/ou contenant description dans la description
     * @param title
     * @param description
     * @return
     */
    @GetMapping("/search/{title}/{description}")
    public List<Offer> getOffreByTitleOrDescription(@PathVariable("title") String title, @PathVariable("description") String description) {
        return offerService.findByTitleContainsOrDescriptionContains(title, description);
    }

    /**
     * Route : /api/offers/byId/{id} | Récupération de l'offre portant l'identifiant id
     * @param offer_id
     * @return
     */
    @GetMapping("/byId/{id}")
    public Optional<Offer> getOfferById(@PathVariable("id") int offer_id) {
        return offerService.getById(offer_id);
    }

    /**
     * Route : /api/offers | Création d'une offre
     * @param offer
     * @return
     */
    @PostMapping("")
    public Offer createOffer(@RequestBody Offer offer) {
        return offerService.save(offer);
    }

    /**
     * Route : /api/offers/close/{id} | Fermeture d'une offre
     * @param closeat
     * @param offer_id
     * @return
     */
    @PutMapping("/close/{id}")
    public int closeOffer(@RequestBody Date closeat, @PathVariable("id") int offer_id) {
        return offerService.updateCloseatByOfferid(closeat, offer_id);
    }

    /**
     * Route : /api/offers/modify/{id} | Modification d'une offre en brouillon
     * @param offerUpdate
     * @param offerid
     * @return
     */
    @PutMapping("/modify/{id}")
    public int updateOffer(@RequestBody OfferUpdate offerUpdate, int offerid) {
        return offerService.updateTitleAndDescriptionAndOpenatByOfferid(offerUpdate.title, offerUpdate.description, offerUpdate.openat, offerid);
    }
}