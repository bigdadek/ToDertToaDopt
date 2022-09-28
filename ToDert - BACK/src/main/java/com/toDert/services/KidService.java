package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.Kid;
import com.toDert.repositories.KidRepository;

@Service
public class KidService implements ServiceInterface<Kid> {
	
	@Autowired
	private KidRepository kidRep;
	
	@Override
	public List<Kid> getAll() {
		return kidRep.findAll();
	}

	@Override
	public Optional<Kid> getById(long id) {
		return kidRep.findById(id);
	}
	
	@Override
	public Kid add(Kid kid) {
		return kidRep.save(kid);
	}

	@Override
	public Kid update(Kid kid) {
		return kidRep.saveAndFlush(kid);
	}

	@Override
	public boolean delete(long id) {
		try {
			kidRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
