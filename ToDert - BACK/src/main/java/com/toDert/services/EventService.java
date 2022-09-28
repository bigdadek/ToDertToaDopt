package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.Event;
import com.toDert.repositories.EventRepository;

@Service
public class EventService implements ServiceInterface<Event> {
	
	@Autowired
	private EventRepository eventRep;
	
	@Override
	public List<Event> getAll() {
		return eventRep.findAll();
	}

	@Override
	public Optional<Event> getById(long id) {
		return eventRep.findById(id);
	}
	
	@Override
	public Event add(Event event) {
		return eventRep.saveAndFlush(event);
	}

	@Override
	public Event update(Event event) {
		return eventRep.saveAndFlush(event);
	}

	@Override
	public boolean delete(long id) {
		try {
			eventRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	
}
