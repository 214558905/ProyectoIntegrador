package com.rafael.falconi.Api.resources;

import com.rafael.falconi.Api.controllers.AreasController;
import com.rafael.falconi.Api.entities.Areas;
import com.rafael.falconi.Api.resources.exceptions.AreasCreateException;


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
    public static final String DOMINIO = "/{dominio}";
    
    private AreasController areasController;
    
    @Autowired
	public AreasResource(AreasController areasController) {
		this.areasController = areasController;
	}
    
    @GetMapping
    public List<Areas> getAllProducts(){
    	
    	return this.areasController.findAllAreas();
    }
    
    @GetMapping(value= ID)
    public ResponseEntity getProductById(@PathVariable int id) {
        Optional<Areas> productOptional = this.areasController.findAreasById(id);
        if (productOptional.isPresent()) {
            return new ResponseEntity(productOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity("\"El producto no  existe\"", HttpStatus.NOT_FOUND);
        }

    }

    
    /*@GetMapping(value = DOMINIO)
    public ResponseEntity getAreasByDominio(@PathVariable String dominio) {
    	
    	Optional<Areas> areasOptional=this.areasController.findAreasByDominio(dominio);
    	
    	if(areasOptional.isPresent()) {
    		
    		return new ResponseEntity(areasOptional.get(), HttpStatus.OK);
    		
    	}else {
    		
    		return new ResponseEntity("\"El dominio no existe\"", HttpStatus.NOT_FOUND);
    	}
    }*/
    
    @DeleteMapping(value = ID)
    public  ResponseEntity deleteAreas(@PathVariable int id){
        if (this.areasController.deleteAreasById(id))
            return new ResponseEntity("\"El area fue eliminado\"", HttpStatus.ACCEPTED);
        return new ResponseEntity("\"El area no  existe\"", HttpStatus.NOT_FOUND);
    }
    
    @PostMapping
    public ResponseEntity createAreas(@RequestBody Areas product) throws AreasCreateException {
        try {
            this.areasController.createProduct(product);
            return new ResponseEntity("\"El area fue creado\"", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new AreasCreateException("los datos enviados no son los correctos");
        }

    }

}
