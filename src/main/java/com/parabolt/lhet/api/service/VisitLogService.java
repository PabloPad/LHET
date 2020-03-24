package com.parabolt.lhet.api.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.entity.VisitLog;
import com.parabolt.lhet.api.repository.AdminRepository;
import com.parabolt.lhet.api.repository.VisitLogRepository;



@Service
public class VisitLogService {
	
	@Autowired
	VisitLogRepository visitLogRepository;

	public VisitLog createVisitLog(VisitLog visitLog) {
		
		return visitLogRepository.save(visitLog);
	}
	
	
	public List<VisitLog> getAllLogs() {
		
		return visitLogRepository.findAll();
	}
	
	public Optional<VisitLog> getLogById(int id) {
		
		return visitLogRepository.findById(id);
	}
}
