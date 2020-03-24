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

import com.parabolt.lhet.api.request.GeneralInfoRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GeneralInfo {

	public GeneralInfo(GeneralInfoRequest request) {
		this.info_note=request.getInfo_notes();
		this.a_id=request.getA_id();
		this.comments="";
		this.created_at= new Date();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String info_note;
	
	@Column
	private String comments;
	
	
	@Column
	private Date created_at;
	
	@Column
	private int a_id;
	
	/*
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Admin admin;
	*/
	
	
}
