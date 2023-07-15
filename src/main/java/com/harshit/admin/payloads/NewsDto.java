package com.harshit.admin.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NewsDto {

	private int newsId;
	private String title;
	private String content;
	private String author;
	private String category;
}
