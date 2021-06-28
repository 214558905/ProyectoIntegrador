package com.rafael.falconi.Api.resources;

import com.rafael.falconi.Api.controllers.AreasController;
import com.rafael.falconi.Api.entities.Areas;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(AreasResource.AREAS)
public class AreasResource {

    public static final String AREAS = "/areas";
    
    private AreasController areasController;
    
    @Autowired
	public AreasResource(AreasController areasController) {
		this.areasController = areasController;
	}
    
    @GetMapping
    public List<Areas> getAllProducts(){
    	
    	return this.areasController.findAllAreas();
    }
    

}
