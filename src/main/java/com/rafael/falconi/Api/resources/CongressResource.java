package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.CongressController;
import com.rafael.falconi.Api.entities.Congress;
import java.util.List;

@RestController
@RequestMapping(CongressResource.CONGRESS)
public class CongressResource {
	
	public static final String CONGRESS ="/congreso";

	private CongressController congressControler;
	
	@Autowired
	public CongressResource(CongressController congressControler) {
		this.congressControler = congressControler;
	}
	
	@GetMapping
	public List<Congress> getAllCongress(){
		
		return this.congressControler.findAllCongress();
		
	}
}
