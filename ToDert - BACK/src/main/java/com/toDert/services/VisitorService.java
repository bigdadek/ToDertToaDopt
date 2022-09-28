package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.Visitor;
import com.toDert.repositories.VisitorRepository;

@Service
public class VisitorService implements ServiceInterface<Visitor> {
	
	@Autowired
	private VisitorRepository visitorRep;
	
	@Override
	public List<Visitor> getAll() {
		return visitorRep.findAll();
	}

	@Override
	public Optional<Visitor> getById(long id) {
		return visitorRep.findById(id);
	}
	
	@Override
	public Visitor add(Visitor visitor) {
		return visitorRep.saveAndFlush(visitor);
	}

	@Override
	public Visitor update(Visitor visitor) {
		return visitorRep.saveAndFlush(visitor);
	}

	@Override
	public boolean delete(long id) {
		try {
			visitorRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
