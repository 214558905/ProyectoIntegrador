package com.rafael.falconi.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.Organization;

public interface OrganizationRepository extends JpaRepository<Organization,String> {

}
