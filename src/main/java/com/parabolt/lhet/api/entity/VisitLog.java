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

import com.parabolt.lhet.api.request.VisitLogRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class VisitLog {

	public VisitLog(VisitLogRequest request) {
		
		this.visit_notes = request.getVisit_notes();
		this.h_id=request.getH_id();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String visit_notes;
	
	
	@Column
	private Date created_at;
	
	@Column
	private int h_id;
	
	/* Alternativa con Hibernate mapping
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private HighRisk high_risk;
	*/
	
	
}
