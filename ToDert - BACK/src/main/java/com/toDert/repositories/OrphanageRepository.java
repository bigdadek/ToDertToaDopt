package com.toDert.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.toDert.entities.Orphanage;


@CrossOrigin("*")

@Repository
public interface OrphanageRepository extends JpaRepository<Orphanage,Long> {

}
