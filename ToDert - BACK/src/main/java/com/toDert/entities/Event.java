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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Events")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id ;
	
	private String title ;
	private String description ;
	private String type ;
	
	private int start_hour ;
	private int end_hour ;
	
	
	private int day ;
    private int month ;
    private Long year ;
    
	private Double fee;
	
	private Long seats ;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Orphanage_ID")
	private Orphanage orphanage;
}
