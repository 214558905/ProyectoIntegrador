package com.rafael.falconi.Api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.entities.Organization;
import com.rafael.falconi.Api.repositories.OrganizationRepository;


@Controller
public class OrganizationController {

    private OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationController(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public List<Organization> findAllOrganization() {
        return this.organizationRepository.findAll();
    }

}
