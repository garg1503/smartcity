package com.harshit.admin.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EventsDto {

	private String name;
	private String date;
	private String time;
	private String location;
	private String description;
}
