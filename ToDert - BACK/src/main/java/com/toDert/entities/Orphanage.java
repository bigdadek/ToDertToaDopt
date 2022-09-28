package com.toDert.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Orphanages")

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class Orphanage extends Users {
	
	private String name ;
	private Long places ;
	private Long full_places ;
	private Long empty_places ;


	

	@OneToMany(mappedBy = "orphanage")
	private List<Event> events;
	
//	@JsonManagedReference
	@OneToMany(mappedBy = "orphanage")
	private List<Kid> kids;
	
	@ManyToMany
		@JoinTable(
			name="Orphanage_AdoptionForm",
			joinColumns=@JoinColumn(name="Orphanage_ID"),
			inverseJoinColumns=@JoinColumn(name="AdoptionForm_ID"))
	 private List<AdoptionForm> adoptionForms;
}
