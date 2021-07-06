package com.rafael.falconi.Api.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rafael.falconi.Api.entities.News;
import com.rafael.falconi.Api.controllers.NewsController;
import java.util.List;

@RestController
@RequestMapping(NewsResource.NEWS)
public class NewsResource {
	
public static final String NEWS="/news";
	
	private NewsController newsController;
	
	
	@Autowired
	public NewsResource(NewsController newsController) {
		this.newsController = newsController;
	}

	
	@GetMapping
	public List<News> getAllNews(){
		
		return this.newsController.findAllNews();
	}


	
}
