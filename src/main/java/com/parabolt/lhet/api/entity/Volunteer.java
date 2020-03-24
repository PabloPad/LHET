package com.parabolt.lhet.api.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.parabolt.lhet.api.request.VolunteerRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Volunteer {

	public Volunteer(VolunteerRequest request) {
		this.volunteer_name = request.getVolunteer_name();
		this.country_code = request.getCountry_code();
		this.a_id = request.getAdmin_id();
		this.address = request.getAddress();
		this.created_at = new Date();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String volunteer_name;
	
	@Column
	private int country_code;
	
	@Column
	private Date created_at;
	
	@Column
	private String address;
	
	@Column
	private int a_id;
	
	//Alternativa usando mappings internos
	/*
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Admin admin;
	*/
	
	
}
