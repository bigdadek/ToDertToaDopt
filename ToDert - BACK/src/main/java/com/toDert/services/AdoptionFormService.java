package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.AdoptionForm;
import com.toDert.repositories.AdoptionFormRepository;

@Service
public class AdoptionFormService implements ServiceInterface<AdoptionForm> {
	
	@Autowired
	private AdoptionFormRepository adoptionFormRep;
	
	@Override
	public List<AdoptionForm> getAll() {
		return adoptionFormRep.findAll();
	}

	@Override
	public Optional<AdoptionForm> getById(long id) {
		return adoptionFormRep.findById(id);
	}
	
	@Override
	public AdoptionForm add(AdoptionForm adoptionForm) {
		return adoptionFormRep.saveAndFlush(adoptionForm);
	}

	@Override
	public AdoptionForm update(AdoptionForm adoptionForm) {
		return adoptionFormRep.saveAndFlush(adoptionForm);
	}

	@Override
	public boolean delete(long id) {
		try {
			adoptionFormRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
