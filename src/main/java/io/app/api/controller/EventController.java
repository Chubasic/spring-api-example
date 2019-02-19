package io.app.api.controller;

import io.app.api.model.Event;
import io.app.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//		return Flux.fromIterable(eventService.getAllEvents());
	}


	@GetMapping("/{id}")
	private Optional<Event> getEvent(@PathVariable String id) {
		return eventService.getOneEvent(id);
//		return Mono.justOrEmpty(eventService.getOneEvent(id));
	}


	@PostMapping("/new")
	private List<Event> addEvent(@RequestBody Event newEvent) {
		eventService.addTopic(newEvent);
//		return Flux.fromIterable(eventService.getAllEvents());
		return eventService.getAllEvents();
	}

}
