
<<<<<<< HEAD
package com.rafael.falconi.Api.controllers;

=======
<<<<<<< HEAD
public class DomainController {

}
=======
>>>>>>> Alex
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import com.rafael.falconi.Api.entities.Domain;
import com.rafael.falconi.Api.repositories.DomainRepository;
import org.springframework.stereotype.Repository;

@Controller
public class DomainController {


    private DomainRepository domainRepository;

    @Autowired
    public DomainController(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;

    }

    public List<Domain> findAllDomain(){

        return this.domainRepository.findAll();

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> Cristhian
>>>>>>> Alex
