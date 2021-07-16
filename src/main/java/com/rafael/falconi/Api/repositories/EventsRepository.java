package com.rafael.falconi.Api.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.Events;




public interface EventsRepository extends JpaRepository<Events,String> {

	List<Events> findEventsById(String id);
}
