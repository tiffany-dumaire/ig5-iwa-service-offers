package com.ig5.project.iwa.services.offers.controller;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import com.ig5.project.iwa.services.offers.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class OfferController {
    @Autowired
    private final OfferService offerService;

    OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("")
    public List<Offer> getAllOffers() {
        return offerService.getAll();
    }
}