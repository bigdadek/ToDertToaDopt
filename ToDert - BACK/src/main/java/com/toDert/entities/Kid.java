package com.toDert.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Kids")

@Data
@AllArgsConstructor
@NoArgsConstructor

//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class, 
//        property = "id")

public class Kid {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id ;
	private String name ;
	private int age ;
	private char gender ;
	

//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="Orphanage_ID")
//	private Orphanage orphanage;

	
	
	@ManyToOne(targetEntity = Orphanage.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "Orphanage_ID", insertable = false, updatable = false)
    @JsonIgnore
    private Orphanage orphanage;

    @Column(name = "Orphanage_ID")
    private Integer OrphanageID;

	public Kid(Long id, String name, int age, char gender, Integer orphanageID) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		OrphanageID = orphanageID;
	}
    
    
}
