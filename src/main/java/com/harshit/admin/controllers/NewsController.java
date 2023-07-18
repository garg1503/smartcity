package com.harshit.admin.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.admin.payloads.NewsDto;
import com.harshit.admin.services.NewsService;


@RestController
@RequestMapping("/api/")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@PostMapping("/newNews")
	public ResponseEntity<NewsDto> createNews(@RequestBody NewsDto newsDto){
		NewsDto createdNews = newsService.createNews(newsDto);
		return new ResponseEntity<NewsDto>(createdNews, HttpStatus.CREATED);
	}
	
	@GetMapping("/news/{newsId}")
	public ResponseEntity<NewsDto> getSinglePost(@PathVariable Integer newsId){
		NewsDto newsDto = newsService.getSingleNews(newsId);
		return new ResponseEntity<NewsDto>(newsDto, HttpStatus.OK);
	}
	
	@GetMapping("/news")
	public ResponseEntity<List<NewsDto>> getAllPosts(
			@RequestParam(value="pageNumber", defaultValue = "0", required = false) Integer pageInteger,
			@RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize
			) {
		List<NewsDto> newsDtos = newsService.getAllNews(pageInteger, pageSize);
		return new ResponseEntity<List<NewsDto>>(newsDtos, HttpStatus.OK);
	}
}
