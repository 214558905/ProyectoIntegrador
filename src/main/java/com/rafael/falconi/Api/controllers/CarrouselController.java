package com.rafael.falconi.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.rafael.falconi.Api.entities.Carrousel;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.repositories.CarrouselRepository;

@Controller
public class CarrouselController {
	
	private CarrouselRepository carrouselRepository;

	
	
	@Autowired
	public CarrouselController(CarrouselRepository carrouselRepository) {
		this.carrouselRepository = carrouselRepository;
	}
	
	public List<Carrousel> findAllCarrousel(){
		
		return this.carrouselRepository.findAll();
		
	}
	

}
