package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.EventsController;
import com.rafael.falconi.Api.entities.Events;
import java.util.List;

@RestController
@RequestMapping (EventsResources.EVENTS)
public class EventsResources {

    public static final String EVENTS = "/events";

    private EventsController eventsController;


    @Autowired
    public EventsResources(EventsController eventsController) {
        this.eventsController = eventsController;
    }

    @GetMapping
    public List<Events> getAllEvents() {

        return this.eventsController.findAllEvents();
    }

}









