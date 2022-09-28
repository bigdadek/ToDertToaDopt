package com.toDert.entities;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Visitors")

@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class Visitor extends Users {
	
	private String firstName ;
	private String lastName ;
	private Long age ;
	private char gender;
	

	
	 @OneToOne(fetch=FetchType.LAZY, mappedBy="visitor")
	 private AdoptionForm adoptionForm ;
		
}

