package com.ig5.project.iwa.services.offers.service;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import com.ig5.project.iwa.services.offers.jpa.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    public Optional<Offer> getById(int id) {
        return offerRepository.findById(id);
    }

    public Offer save(Offer newOffer) {
        return offerRepository.save(newOffer);
    }

    public void delete(int id){
        offerRepository.deleteById(id);
    }
}