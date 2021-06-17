package com.rafael.falconi.Api.resources;

import com.rafael.falconi.Api.controllers.AreasController;
import com.rafael.falconi.Api.entities.Areas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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
    public List<Areas> getAllProducts(){
    	
    	return this.areasController.findAllAreas();
    }
    @GetMapping(value = ID)
    public ResponseEntity getAreasById(@PathVariable int id) {
    	
    	Optional<Areas> areasOptional=this.areasController.findAreasById(id);
    	
    	if(areasOptional.isPresent()) {
    		
    		return new ResponseEntity(areasOptional.get(), HttpStatus.OK);
    		
    	}else {
    		
    		return new ResponseEntity("\"El area no existe\"", HttpStatus.NOT_FOUND);
    	}
    }
    
}
