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

import com.toDert.entities.Kid;
import com.toDert.services.KidService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class kidController {
	
	@Autowired
	private KidService kidService;
	
	@GetMapping("/kid")
	public List<Kid> getAllKid(){
		return kidService.getAll();
	}		
	
	@PostMapping("/kid")
	public ResponseEntity<Kid> createKid(@RequestBody Kid kids) {
		Kid createdKid = kidService.add(kids); 
		//Kid createdKid = kidrep.save(kid); 
		 return ResponseEntity.ok(createdKid);
	}

	@GetMapping("/kid/{id}")
	public Optional<Kid> getKidById(@PathVariable Long id) {
		return kidService.getById(id);
	}
	
	@PutMapping("/kid/{id}")
	public ResponseEntity<Kid> updateKid(@PathVariable Long id, @RequestBody Kid kidDetails){
		Kid updatedKid = kidService.update(kidDetails);
		return ResponseEntity.ok(updatedKid);
	}
	
	@DeleteMapping("/kid/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteKid(@PathVariable Long id){
		kidService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
