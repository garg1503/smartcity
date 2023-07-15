package com.harshit.admin.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshit.admin.entities.Events;
import com.harshit.admin.payloads.EventsDto;
import com.harshit.admin.repositories.EventsRepository;
import com.harshit.admin.services.EventsService;

@Service
public class EventsServiceImpl implements EventsService {
	
	@Autowired
	private EventsRepository eventsRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EventsDto createEvent(EventsDto eventsDto) {
		Events events = new Events();
		events.setName(eventsDto.getName());
		events.setDate(eventsDto.getDate());
		events.setTime(eventsDto.getTime());
		events.setLocation(eventsDto.getLocation());
		events.setDescription(eventsDto.getDescription());
		Events createdEvents = eventsRepository.save(events);
		EventsDto createdEventsDto = modelMapper.map(createdEvents, EventsDto.class);
		return createdEventsDto;
	}

}
