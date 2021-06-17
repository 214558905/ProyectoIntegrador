package com.rafael.falconi.Api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.falconi.Api.controllers.AreasController;
import com.rafael.falconi.Api.entities.Areas;

@RestController
@RequestMapping(AreasResource.AREAS)
public class AreasResource {

    public static final String AREAS = "/areas";
    public static final String ID = "/{id}";
    public static final String DOMINIO = "/dominio";
    public static final String LINEA = "/linea";
    
    private AreasController areasController;
    
    @Autowired
	public AreasResource(AreasController areasController) {
		this.areasController = areasController;
	}
    
    @GetMapping
    public List<Areas> getAllAreas(@RequestParam(required = false ) String linea){
    	
    	 if (linea == null) return this.areasController.findAreasByLinea(linea);
         return this.areasController.findAreasByLinea(linea);
    }
     
    
}
