package com.harshit.admin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "news")
@Getter
@Setter
@NoArgsConstructor
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newsId;
	private String title;
	private String content;
	private String author;
	private String category;
}
