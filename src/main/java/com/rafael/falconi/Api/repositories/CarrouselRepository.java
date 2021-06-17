package com.rafael.falconi.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.Carrousel;



public interface CarrouselRepository extends JpaRepository<Carrousel,Integer> {
	
}
