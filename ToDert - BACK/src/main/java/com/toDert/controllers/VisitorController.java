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

import com.toDert.entities.Visitor;
import com.toDert.services.VisitorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VisitorController {
	
	@Autowired
	private VisitorService visitorService;
	
	@GetMapping("/visitor")
	public List<Visitor> getAllVisitor(){
		return visitorService.getAll();
	}		
	
	@PostMapping("/visitor")
	public ResponseEntity<Visitor> createVisitor(@RequestBody Visitor visitor) {
		Visitor createdVisitor = visitorService.add(visitor); 
		//Visitor createdVisitor = visitorrep.save(visitor); 
		 return ResponseEntity.ok(createdVisitor);
	}

	@GetMapping("/visitor/{id}")
	public Optional<Visitor> getVisitorById(@PathVariable Long id) {
		return visitorService.getById(id);
	}
	
	@PutMapping("/visitor/{id}")
	public ResponseEntity<Visitor> updateVisitor(@PathVariable Long id, @RequestBody Visitor visitorDetails){
		Visitor updatedVisitor = visitorService.update(visitorDetails);
		return ResponseEntity.ok(updatedVisitor);
	}
	
	@DeleteMapping("/visitor/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteVisitor(@PathVariable Long id){
		visitorService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
