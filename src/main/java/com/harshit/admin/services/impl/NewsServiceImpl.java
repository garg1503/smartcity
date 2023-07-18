package com.harshit.admin.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.harshit.admin.entities.News;
import com.harshit.admin.exceptions.ResourceNotFoundException;
import com.harshit.admin.payloads.NewsDto;
import com.harshit.admin.repositories.NewsRepository;
import com.harshit.admin.services.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsRepository newsRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public NewsDto createNews(NewsDto newsDto) {
		News news = new News();
		news.setTitle(newsDto.getTitle());
		news.setAuthor(newsDto.getAuthor());
		news.setContent(newsDto.getContent());
		news.setCategory(newsDto.getCategory());
		News createdNews = newsRepository.save(news);
		NewsDto createdNewsDto = modelMapper.map(createdNews, NewsDto.class);
		return createdNewsDto;
	}

	@Override
	public NewsDto getSingleNews(Integer newsId) {
		News news = newsRepository.findById(newsId).orElseThrow(()-> new ResourceNotFoundException("News", "Id", newsId));
		NewsDto newsDto = modelMapper.map(news, NewsDto.class);
		return newsDto;
	}

	@Override
	public List<NewsDto> getAllNews(Integer pageNumber, Integer pageSize) {
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		Page<News> pageNews = newsRepository.findAll(p);
		List<News> allNews = pageNews.getContent();
		
		List<NewsDto> newsDtos = allNews.stream().map((post)->modelMapper.map(post, NewsDto.class)).collect(Collectors.toList());
		return newsDtos;
	}

	@Override
	public List<NewsDto> getAllNewsforHeadlines() {
		List<News> allNews = newsRepository.findAll();
		List<NewsDto> newsDtos = allNews.stream().map((news) -> modelMapper.map(news, NewsDto.class)).collect(Collectors.toList());
		return newsDtos;
	}

	

	

}