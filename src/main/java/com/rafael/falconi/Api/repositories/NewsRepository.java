package com.rafael.falconi.Api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.falconi.Api.entities.News;

public interface NewsRepository extends JpaRepository<News,Integer> {
		
}
