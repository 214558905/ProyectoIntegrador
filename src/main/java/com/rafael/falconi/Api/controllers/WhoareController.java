package com.rafael.falconi.Api.controllers;

import java.util.List;

import com.rafael.falconi.Api.entities.Carrousel;
import com.rafael.falconi.Api.repositories.CarrouselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.rafael.falconi.Api.entities.WhoAre;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.repositories.WhoAreRepository;

@Controller
public class WhoareController {
    private WhoAreRepository whoAreRepository;



    @Autowired
    public WhoareController(WhoAreRepository whoAreRepository) {
        this.whoAreRepository = whoAreRepository;
    }

    public List<WhoAre> findAllWhoare(){

        return this.whoAreRepository.findAll();

    }


}
