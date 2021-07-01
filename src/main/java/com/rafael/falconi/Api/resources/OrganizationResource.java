package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.OrganizationController;
import com.rafael.falconi.Api.entities.Organization;
import java.util.List;

@RestController
@RequestMapping(OrganizationResource.ORGANIZATION)
public class OrganizationResource {
    public static final String ORGANIZATION ="/organization";

    private OrganizationController organizationController;

    @Autowired
    public OrganizationResource(OrganizationController organizationController) {
        this.organizationController = organizationController;
    }

    @GetMapping
    public List<Organization> getAllOrganization(){

        return this.organizationController.findAllOrganization();

    }
}

