package com.ig5.project.iwa.services.offers.service;

import com.ig5.project.iwa.services.offers.jpa.entity.Company;
import com.ig5.project.iwa.services.offers.jpa.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    /**
     * Récupération de toutes les entreprises
     * @return
     */
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    /**
     * Récupération des infos d'une entreprise (fait pour la page profil entreprise)
     * @param company_id
     * @return
     */
    public Optional<Company> findById(Long company_id) { return companyRepository.findById(company_id); }

    /**
     * Création d'une entreprise
     * @param company
     * @return
     */
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }
}
