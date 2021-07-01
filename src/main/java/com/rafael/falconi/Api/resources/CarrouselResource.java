package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.CarrouselController;
import com.rafael.falconi.Api.entities.Carrousel;
import java.util.List;


@RestController
@RequestMapping(CarrouselResource.CARROUSEL)
public class CarrouselResource {
<<<<<<< HEAD
	
	public static final String CARROUSEL="/carrousel";
	
	private CarrouselController carrouselControler;
	
	
=======

	public static final String CARROUSEL="/carrousel";

	private CarrouselController carrouselControler;


>>>>>>> Cristhian
	@Autowired
	public CarrouselResource(CarrouselController carrouselControler) {
		this.carrouselControler = carrouselControler;
	}
<<<<<<< HEAD
	
	@GetMapping
	public List<Carrousel> getAllCarrousel(){
		
		return this.carrouselControler.findAllCarrousel();
	}
	
=======

	@GetMapping
	public List<Carrousel> getAllCarrousel(){

		return this.carrouselControler.findAllCarrousel();
	}

>>>>>>> Cristhian
	

}
