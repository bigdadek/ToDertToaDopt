package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.Event;
import com.toDert.entities.Orphanage;
import com.toDert.repositories.OrphanageRepository;

@Service
public class OrphanageService implements ServiceInterface<Orphanage> {
	
	@Autowired
	private OrphanageRepository orphanageRep;
	
	@Override
	public List<Orphanage> getAll() {
		return orphanageRep.findAll();
	}

	@Override
	public Optional<Orphanage> getById(long id) {
		return orphanageRep.findById(id);
	}
	
	@Override
	public Orphanage add(Orphanage orphanage) {
		return orphanageRep.saveAndFlush(orphanage);
	}

	@Override
	public Orphanage update(Orphanage orphanage) {
		return orphanageRep.saveAndFlush(orphanage);
	}

	@Override
	public boolean delete(long id) {
		try {
			orphanageRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	List<Event> findByOrphanageId(long id)
	{
		
		return null;
		
	}

}
