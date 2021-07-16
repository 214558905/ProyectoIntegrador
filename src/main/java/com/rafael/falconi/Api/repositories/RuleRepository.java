package com.rafael.falconi.Api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.rafael.falconi.Api.entities.Rules;

public interface RuleRepository extends JpaRepository<Rules,String>{
	

}
