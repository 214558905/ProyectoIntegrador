package com.rafael.falconi.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.rafael.falconi.Api.entities.Events;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.repositories.EventsRepository;

@Controller
public class EventsController {

    private EventsRepository eventsRepository;

    @Autowired
    public EventsController(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public List<Events> findAllEvents(){

        return this.eventsRepository.findAll();

    }

}
