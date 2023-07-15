package com.harshit.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshit.admin.entities.News;

public interface NewsRepository extends JpaRepository<News, Integer> {
	
}
