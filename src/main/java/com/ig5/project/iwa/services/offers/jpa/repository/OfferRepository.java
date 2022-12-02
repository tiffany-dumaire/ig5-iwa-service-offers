package com.ig5.project.iwa.services.offers.jpa.repository;

import com.ig5.project.iwa.services.offers.jpa.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<Offer,Long> {
    /**
     * Récupérer la liste complète des offres
     * @return List<Offer>
     */
    List<Offer> findAll();

    /**
     * Rechercher une offre par id (pour les affichages frontend)
     * @param offer_id
     * @return Optional<Offer>
     */
    Optional<Offer> findByOfferid(int offer_id);


    /**
     * Recherche par titre, récupération d'une liste d'offres
     * @param title
     * @return List<Offer>
     */
    @Query("select distinct o from Offer o " +
            "where lower(o.title) like lower(concat('%', ?1, '%'))")
    List<Offer> findByTitleContains(String title);

    /**
     * Sélectionne la liste des offres contenant la chaine de caractère "title" dans le titre de l'offre et/ou la chaine de caractère "description" dans la description
     * @param title
     * @param description
     * @return
     */
    @Query("select distinct o from Offer o " +
            "where lower(o.title) like lower(concat('%', ?1, '%')) or lower(o.description) like lower(concat('%', ?2, '%'))")
    List<Offer> findByTitleContainsOrDescriptionContains(String title, String description);

    /**
     * Compte le nombre de résultat distinct
     * @param title
     * @param description
     * @return
     */
    @Query("select count(distinct o) from Offer o " +
            "where lower(o.title) like lower(concat('%', ?1, '%')) or lower(o.description) like lower(concat('%', ?2, '%'))")
    long countDistinctByTitleContainsOrDescriptionContains(String title, String description);

    /**
     * Fermeture de l'offre
     * @param closeat
     * @param offerid
     * @return
     */
    @Transactional
    @Modifying
    @Query("update Offer o set o.closeat = ?1 where o.offerid = ?2")
    int updateCloseatByOfferid(Date closeat, int offerid);

    /**
     * Tant qu'une offre n'a pas de date d'ouverture, elle reste en brouillon, on peut donc toujours modifier le titre, la description et la date d'ouverture de l'offre
     * @param title
     * @param description
     * @param openat
     * @param offerid
     * @return
     */
    @Transactional
    @Modifying
    @Query("update Offer o set o.title = ?1, o.description = ?2, o.openat = ?3 where o.offerid = ?4")
    int updateTitleAndDescriptionAndOpenatByOfferid(String title, String description, Date openat, int offerid);
}