package com.harshit.admin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.admin.entities.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
	
}
