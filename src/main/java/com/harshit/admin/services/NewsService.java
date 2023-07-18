package com.harshit.admin.services;

import java.util.List;

import com.harshit.admin.payloads.NewsDto;

public interface NewsService {
	
	NewsDto createNews(NewsDto newsDto);
	
	NewsDto getSingleNews(Integer newsId);
	
	List<NewsDto> getAllNews(Integer pageNumber, Integer pageSize);
	
	List<NewsDto> getAllNewsforHeadlines();

}
