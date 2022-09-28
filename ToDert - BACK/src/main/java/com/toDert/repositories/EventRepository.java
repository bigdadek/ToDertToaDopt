package com.toDert.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.toDert.entities.Event;

@CrossOrigin("*")

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

	//List<Event> findByOrphanageId(long id);

}
