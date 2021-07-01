package com.rafael.falconi.Api.controllers;

import com.rafael.falconi.Api.entities.Areas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.repositories.AreasRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class AreasController {

		private AreasRepository areaRepository;

		@Autowired
		public AreasController(AreasRepository areaRepository) {
			
			this.areaRepository = areaRepository;
		}
		
		public List<Areas> findAllAreas(){
			
			return this.areaRepository.findAll();
		}
		
	
		
} 
