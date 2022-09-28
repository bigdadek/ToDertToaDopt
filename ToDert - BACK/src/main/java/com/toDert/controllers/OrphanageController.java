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

import com.toDert.entities.Orphanage;
import com.toDert.services.OrphanageService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrphanageController {
	
	@Autowired
	private OrphanageService orphanageService;
	
	@GetMapping("/orphanage")
	public List<Orphanage> getAllOrphanage(){
		return orphanageService.getAll();
	}		
	
	@PostMapping("/orphanage")
	public ResponseEntity<Orphanage> createOrphanage(@RequestBody Orphanage orphanages) {
		Orphanage createdOrphanage = orphanageService.add(orphanages); 
		//Orphanage createdOrphanage = orphanagerep.save(orphanage); 
		 return ResponseEntity.ok(createdOrphanage);
	}

	@GetMapping("/orphanage/{id}")
	public Optional<Orphanage> getOrphanageById(@PathVariable Long id) {
		return orphanageService.getById(id);
	}
	
	@PutMapping("/orphanage/{id}")
	public ResponseEntity<Orphanage> updateOrphanage(@PathVariable Long id, @RequestBody Orphanage orphanageDetails){
		Orphanage updatedOrphanage = orphanageService.update(orphanageDetails);
		return ResponseEntity.ok(updatedOrphanage);
	}
	
	@DeleteMapping("/orphanage/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteOrphanage(@PathVariable Long id){
		orphanageService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
