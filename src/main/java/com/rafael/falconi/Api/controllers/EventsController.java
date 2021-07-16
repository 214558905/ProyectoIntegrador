package com.rafael.falconi.Api.controllers;

import java.util.List;
import java.util.Optional;

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
   
     public Optional<Events> findEventById(String id){
    	
    	return this.eventsRepository.findById(id);
    }
     public void createEvent(Events event) {
     	
     	this.eventsRepository.save(event);
     }
    
    
    public boolean deleteEventsById(String id) {
    	
    	Optional<Events> eventsOptional = this.findEventById(id);
    	if(!eventsOptional.isPresent()) return false;
    	eventsRepository.deleteById(id);
    	return true;
    }
    public boolean editEventById(String id,Events event) {
        Optional<Events> eventOptional = this.findEventById(id);
        if (!eventOptional.isPresent()) return false;
        Events eventdb = eventOptional.get();
        eventdb.setDescription(event.getDescription());
        event.setName(event.getName());
        event.setImagen(event.getImagen());
        return true;
    }

}
