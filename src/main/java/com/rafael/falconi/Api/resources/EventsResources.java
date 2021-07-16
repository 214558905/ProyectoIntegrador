package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.EventsController;
import com.rafael.falconi.Api.entities.Events;
import com.rafael.falconi.Api.resources.exceptions.EditEventException;
import com.rafael.falconi.Api.resources.exceptions.EventCreateException;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (EventsResources.EVENTS)
public class EventsResources {

    public static final String EVENTS = "/events";
    public static final String ID = "/{id}";

    private EventsController eventsController;


    @Autowired
    public EventsResources(EventsController eventsController) {
        this.eventsController = eventsController;
    }

    @GetMapping
    public List<Events> getAllEvents() {

        return this.eventsController.findAllEvents();
    }
    @GetMapping(value =ID)
    public ResponseEntity<Object> getEventsById(@PathVariable String id){
    	
    	Optional<Events> eventOptional = this.eventsController.findEventById(id);
    	if (eventOptional.isPresent()) {
    		
    		return new ResponseEntity<>(eventOptional.get(),HttpStatus.OK);
    		
    	} else {
    		
    		return new ResponseEntity<>("\"El producto no  existe\"", HttpStatus.NOT_FOUND);
    	}
    	
    }
    @PostMapping
    public ResponseEntity<String> createEvent(@RequestBody Events event) throws EventCreateException {
        try {
            this.eventsController.createEvent(event);
            return new ResponseEntity<>("\"El producto fue creado\"", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new EventCreateException("los datos enviados no son los correctos");
        }

    }
    @PutMapping(value = ID)
    public ResponseEntity<String> editProduct(@RequestBody Events event , @PathVariable String id) throws EditEventException {
        try {
            if (this.eventsController.editEventById(id, event))
                return new ResponseEntity<>("\"El producto fue edito\"", HttpStatus.ACCEPTED);
            return new ResponseEntity<>("\"El producto no  existe\"", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            throw new EditEventException("los datos enviados no son los correctos");
        }
    }
    
    @DeleteMapping(value = ID)
    public ResponseEntity<String> deleteProduct(@PathVariable String id){
    	
    	if(this.eventsController.deleteEventsById(id))
    		return new ResponseEntity<>("\"El producto fue eliminado\"", HttpStatus.ACCEPTED);
            return new ResponseEntity<>("\"El producto no  existe\"", HttpStatus.NOT_FOUND);
    }
}









