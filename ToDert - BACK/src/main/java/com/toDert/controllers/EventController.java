package com.toDert.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toDert.entities.Event;
import com.toDert.services.EventService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {
	@Autowired
	private EventService eventService;
	
	@GetMapping("/event")
	public List<Event> getAllEvent(){
		return eventService.getAll();
	}		
	
	@PostMapping("/event")
	public ResponseEntity<Event> createEvent(@RequestBody Event events) {
		Event createdEvent = eventService.add(events); 
		//Event createdEvent = eventrep.save(event); 
		 return ResponseEntity.ok(createdEvent);
	}
	
//	@GetMapping("/{id}/event")
//	public List<Event> getAllEventofanOrphanage(@PathVariable Long id){
//		return eventService.getAll();
//	}		

	@GetMapping("/event/{id}")
	public Optional<Event> getEventById(@PathVariable Long id) {
		return eventService.getById(id);
	}
	
	@PutMapping("/event/{id}")
	public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event eventDetails){
		Event updatedEvent = eventService.update(eventDetails);
		return ResponseEntity.ok(updatedEvent);
	}
	
	@DeleteMapping("/event/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEvent(@PathVariable Long id){
		eventService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
