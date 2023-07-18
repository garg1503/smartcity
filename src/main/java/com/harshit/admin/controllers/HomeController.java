package com.harshit.admin.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.admin.payloads.NewsDto;
import com.harshit.admin.services.NewsService;

@RestController
@RequestMapping("/home/")
public class HomeController {

	@Autowired
	private NewsService newsService;
	
	@GetMapping("/headlines")
	public List<String> getLatestNewsHeadlines(){
		List<NewsDto> latestNews = newsService.getAllNewsforHeadlines();
		
		int maxHeadlinesToShow = 5;
		
		return latestNews.stream()
				.map(NewsDto::getTitle)
				.limit(maxHeadlinesToShow)
				.collect(Collectors.toList());
	}
}
