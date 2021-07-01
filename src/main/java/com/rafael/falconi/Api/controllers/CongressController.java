package com.rafael.falconi.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.entities.Congress;
import com.rafael.falconi.Api.repositories.CongressRepository;

@Controller 
public class CongressController {
	
	private CongressRepository congressRepository;
	
	@Autowired
	public CongressController(CongressRepository congressRepository) {
		this.congressRepository = congressRepository;
	}
	
	public List<Congress> findAllCongress(){
<<<<<<< HEAD
=======

>>>>>>> Cristhian
		
		return this.congressRepository.findAll();
		
	}
	
	
}
