package com.ig5.project.iwa.services.offers.jpa.repository;

import com.ig5.project.iwa.services.offers.jpa.entity.Recommandation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommandationRepository extends JpaRepository<Recommandation,Long> {
    List<Recommandation> findByUserid(int user_id);
}
