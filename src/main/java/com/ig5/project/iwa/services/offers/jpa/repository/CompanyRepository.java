package com.ig5.project.iwa.services.offers.jpa.repository;

import com.ig5.project.iwa.services.offers.jpa.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {}
