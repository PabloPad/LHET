package com.parabolt.lhet.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.parabolt.lhet.api.request.AdminRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Admin {
	
	public Admin(AdminRequest request) {
		this.full_name=request.getFull_name();
		this.country_code=request.getCountry_code();
		this.profession=request.getProfession();
		this.adress=request.getAddress();
		this.created_at = new Date();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String full_name;
	
	@Column
	private int country_code;
	
	@Column
	private String profession;
	
	@Column
	private Date created_at;
	
	@Column
	private String adress;
	
	
	
}
