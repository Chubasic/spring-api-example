package io.app.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.app.api.model.Event;
import io.app.api.repo.EventRepo;

@Service
public class EventService {

	// Injecting eventrepo to service
	@Autowired
	private EventRepo eventRepo;

	public List<Event> getAllEvents() {
		List<Event> events = new ArrayList<>();
		//Method reference events -> events.add()
		eventRepo.findAll().forEach(e -> events.add(e));
		return events;
	}

	public void addTopic(Event event) {
		eventRepo.save(event);
	}


	public Optional<Event> getOneEvent(String id) {
		return eventRepo.findById(id);
	}


	public void updateEvent(String id, Event event) {
		eventRepo.save(event);
	}

	public void deleteEvent(String id) {
		eventRepo.deleteById(id);
	}


}
