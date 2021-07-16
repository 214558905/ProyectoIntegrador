package com.rafael.falconi.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.Domain;


public interface DomainRepository extends JpaRepository<Domain,String> {


}
