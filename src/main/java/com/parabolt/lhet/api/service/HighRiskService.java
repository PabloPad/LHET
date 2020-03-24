package com.parabolt.lhet.api.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.entity.HighRisk;
import com.parabolt.lhet.api.repository.AdminRepository;
import com.parabolt.lhet.api.repository.HighRiskRepository;



@Service
public class HighRiskService {
	
	@Autowired
	HighRiskRepository highRiskRepository;

	public HighRisk createHighRisk(HighRisk highRisk) {
		
		return highRiskRepository.save(highRisk);
	}
	
	
	public List<HighRisk> getAllHighRisks() {
		
		return highRiskRepository.findAll();
	}
	
	public Optional<HighRisk> getHighRiskById(int id) {
		
		return highRiskRepository.findById(id);
	}
}
