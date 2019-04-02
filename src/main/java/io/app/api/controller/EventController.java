package io.app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.app.api.model.Event;
import io.app.api.service.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {
	@Autowired
	private EventService eventService;

	@GetMapping("/all")
	private List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}

	@GetMapping("/{id}")
	private Optional<Event> getEvent(@PathVariable String id) {
		return eventService.getOneEvent(id);
	}

	@PostMapping("/new")
	private List<Event> addEvent(@RequestBody Event newEvent) {
		eventService.addTopic(newEvent);
		return eventService.getAllEvents();
	}

}
