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

import com.toDert.entities.AdoptionForm;
import com.toDert.services.AdoptionFormService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdoptionFormController {
	
	@Autowired
	private AdoptionFormService adoptionFormService;
	
	@GetMapping("/adoptionForm")
	public List<AdoptionForm> getAllAdoptionForm(){
		return adoptionFormService.getAll();
	}		
	
	@PostMapping("/adoptionForm")
	public ResponseEntity<AdoptionForm> createAdoptionForm(@RequestBody AdoptionForm adoptionForms) {
		AdoptionForm createdAdoptionForm = adoptionFormService.add(adoptionForms); 
		//AdoptionForm createdAdoptionForm = adoptionFormrep.save(adoptionForm); 
		 return ResponseEntity.ok(createdAdoptionForm);
	}

	@GetMapping("/adoptionForm/{id}")
	public Optional<AdoptionForm> getAdoptionFormById(@PathVariable Long id) {
		return adoptionFormService.getById(id);
	}
	
	@PutMapping("/adoptionForm/{id}")
	public ResponseEntity<AdoptionForm> updateAdoptionForm(@PathVariable Long id, @RequestBody AdoptionForm adoptionFormDetails){
		AdoptionForm updatedAdoptionForm = adoptionFormService.update(adoptionFormDetails);
		return ResponseEntity.ok(updatedAdoptionForm);
	}
	
	@DeleteMapping("/adoptionForm/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAdoptionForm(@PathVariable Long id){
		adoptionFormService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
