package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.DomainController;
import com.rafael.falconi.Api.entities.Domain;
import java.util.List;


@RestController
@RequestMapping(DomainResource.DOMAIN)
public class DomainResource {

    public static final String DOMAIN ="/domain";

    private DomainController domainController;

    @Autowired
    public DomainResource(DomainController domainController) {
        this.domainController = domainController;
    }

    @GetMapping
    public List<Domain> getAllDomain(){

        return this.domainController.findAllDomain();

    }
}

