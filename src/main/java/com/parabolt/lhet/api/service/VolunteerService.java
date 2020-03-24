package com.parabolt.lhet.api.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.entity.VisitLog;
import com.parabolt.lhet.api.entity.Volunteer;
import com.parabolt.lhet.api.repository.AdminRepository;
import com.parabolt.lhet.api.repository.VisitLogRepository;
import com.parabolt.lhet.api.repository.VolunteerRepository;



@Service
public class VolunteerService {
	
	@Autowired
	VolunteerRepository volunteerRepository;

	public Volunteer createVolunteer(Volunteer volunteer) {
		
		return volunteerRepository.save(volunteer);
	}
	
	
	public List<Volunteer> getAllVolunteers() {
		
		return volunteerRepository.findAll();
	}
	
	public Optional<Volunteer> getVolunteerById(int id) {
		
		return volunteerRepository.findById(id);
	}
}
