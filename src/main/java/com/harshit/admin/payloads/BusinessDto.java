package com.harshit.admin.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusinessDto {

	private String name;
	private String address;
	private String contact;
	private String category;
	private String timing;
	private String ratings;
}
