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

import com.parabolt.lhet.api.request.HighRiskRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class HighRisk {
	
	public HighRisk(HighRiskRequest request) {
		this.high_risk_name=request.getHigh_risk_name();
		this.country_code=request.getCountry_code();
		this.status=request.getStatus();
		this.address=request.getAddress();
		this.case_type=request.getCase_type();
		this.created_at = new Date();
		this.v_id=request.getV_id();
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String high_risk_name;
	
	@Column
	private int country_code;

	@Column
	private Date created_at;
	
	@Column
	private String case_type;
	
	@Column
	private String status;
	
	@Column
	private String address;
	
	@Column
	private int v_id;
	
	/* Alternative using Hibernate mappings
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Volunteer volunteer;
	*/
	
	
	
}
