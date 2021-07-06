package com.rafael.falconi.Api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.entities.News;
import com.rafael.falconi.Api.repositories.NewsRepository;

@Controller
public class NewsController {

	private NewsRepository newsRepository;

	@Autowired
	public NewsController(NewsRepository newRepository) {
		this.newsRepository = newRepository;
	}

	public List<News> findAllNews(){
		
		return this.newsRepository.findAll();
	}

	
}
