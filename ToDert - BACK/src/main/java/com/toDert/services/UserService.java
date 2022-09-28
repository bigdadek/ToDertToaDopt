package com.toDert.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toDert.entities.Users;
import com.toDert.repositories.UserRepository;

@Service
public class UserService implements ServiceInterface<Users>  {
	
	@Autowired
	private UserRepository userRep;
	
	@Override
	public List<Users> getAll() {
		return userRep.findAll();
	}

	@Override
	public Optional<Users> getById(long id) {
		return userRep.findById(id);
	}
	
	@Override
	public Users add(Users user) {
		return userRep.saveAndFlush(user);
	}

	@Override
	public Users update(Users user) {
		return userRep.saveAndFlush(user);
	}

	@Override
	public boolean delete(long id) {
		try {
			userRep.deleteById(id);
			return true;
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}


}
