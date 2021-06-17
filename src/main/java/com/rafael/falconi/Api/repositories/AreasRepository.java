package com.rafael.falconi.Api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.Areas;



public interface AreasRepository extends JpaRepository<Areas,Integer> {
	
	List<Areas> findAreasBylinea (String linea);


}
