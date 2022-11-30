package com.ig5.project.iwa.services.offers.jpa.repository;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OfferRepository extends JpaRepository<Offer,Long> {
    List<Offer> findAll();

    Optional<Offer> findById(int id);

    void deleteById(int id);
}