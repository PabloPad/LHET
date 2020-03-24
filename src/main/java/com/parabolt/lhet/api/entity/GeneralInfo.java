package com.parabolt.lhet.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GeneralInfo {

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
