package com.harshit.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.admin.payloads.EventsDto;
import com.harshit.admin.services.EventsService;

@RestController
public class EventsController {

	@Autowired
	private EventsService eventsService;
	
	@PostMapping("/newEvent")
	public ResponseEntity<EventsDto> createEvent(@RequestBody EventsDto eventsDto){
		EventsDto eventsDto2 = eventsService.createEvent(eventsDto);
		return new ResponseEntity<EventsDto>(eventsDto2, HttpStatus.CREATED);
	}
}
