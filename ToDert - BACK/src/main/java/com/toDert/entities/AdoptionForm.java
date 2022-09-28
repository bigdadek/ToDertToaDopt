package com.toDert.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AdoptionForm")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdoptionForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
//	User
	private String job;
	private String montelySalary;
	
//	Partner
	private boolean partner;
	private String partner_firstName ;
	private String partner_lastName ;
	private Long partner_age ;
	private char partner_gender ;
	private String partner_phone ;
	private String partner_email ;
	private String partner_job;
	private String partner_montelySalary;
	
//	Kid
	private Long kid_age_min ;
	private Long kid_age_max ;
	private char kid_gender ;
	

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Visitor_ID")
	private Visitor visitor;
	 
	 @ManyToMany(mappedBy="adoptionForms")
	 private List<Orphanage> orphanages;


}