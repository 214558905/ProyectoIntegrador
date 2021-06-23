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
		
		public Optional<Areas> findAreasById(int id){
			
			return this.areaRepository.findById(id);
		}
		
		public Optional<Areas> findAreasByLinea(String linea){
			
			return this.areaRepository.findAreasByLinea(linea);
		}

		public Optional<Areas> findAreasByDominio(String dominio){
			
			return this.areaRepository.findAreasByDominio(dominio);
		}
		
		public void createProduct(Areas areas) {
	        this.areaRepository.save(areas);
	    }
		
		public boolean deleteAreasById(int id) {
	        Optional<Areas> productOptional = this.findAreasById(id);
	        if (!productOptional.isPresent()) return false;
	        areaRepository.deleteById(id);
	        return true;
	    }
		
} 
