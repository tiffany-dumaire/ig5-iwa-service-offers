package com.ig5.project.iwa.services.offers.controller;

import com.ig5.project.iwa.services.offers.jpa.entity.Company;
import com.ig5.project.iwa.services.offers.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    @Autowired
    private final CompanyService companyService;

    CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * Route : /api/companies | liste des entreprises
     * @return
     */
    @GetMapping("")
    public List<Company> getAllCompanies() {
        return companyService.findAll();
    }

    /**
     * Route : /api/companies/{id} | Récupération des infos de l'entreprise ayant l'identifiant "id"
     * @param company_id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable("id") Long company_id) {
        return companyService.findById(company_id);
    }

    /**
     * Route : /api/companies | Création d'une entreprise
     * @param company
     * @return
     */
    @PostMapping("")
    public Company createCompany(@RequestBody Company company) {
        return companyService.createCompany(company);
    }
}
