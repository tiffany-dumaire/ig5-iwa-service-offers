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
     * Récupérer toutes les offres existantes
     * @return
     */
    @GetMapping("")
    public List<Offer> getAllOffers() {
        return offerService.getAll();
    }

    @GetMapping("/search/{title}")
    public List<Offer> getOffreByTitle(@PathVariable("title") String title) {
        return offerService.findByTitleContains(title);
    }

    @GetMapping("/search/{title}/{description}")
    public List<Offer> getOffreByTitleOrDescription(@PathVariable("title") String title, @PathVariable("description") String description) {
        return offerService.findByTitleContainsOrDescriptionContains(title, description);
    }

    @GetMapping("/byId/{id}")
    public Optional<Offer> getOfferById(@PathVariable("id") int offer_id) {
        return offerService.getById(offer_id);
    }

    @PostMapping("")
    public Offer createCustomer(@RequestBody Offer offer) {
        return offerService.save(offer);
    }

    @PutMapping("/close/{id}")
    public int closeOffer(@RequestBody Date closeat, @PathVariable("id") int offer_id) {
        return offerService.updateCloseatByOfferid(closeat, offer_id);
    }

    @PutMapping("/modify/{id}")
    public int updateOffer(@RequestBody OfferUpdate offerUpdate, int offer_id) {
        return offerService.updateTitleAndDescriptionAndOpenatByOfferid(offerUpdate.title, offerUpdate.description, offerUpdate.openat, offer_id);
    }
}