package com.parabolt.lhet.api.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.parabolt.lhet.api.entity.Volunteer;

import com.parabolt.lhet.api.service.VolunteerService;


@Controller
@CrossOrigin
@RequestMapping("/home")
public class VolunteerController {

	@Autowired
	VolunteerService volunteerService;
	
	@PostMapping("/volunteers")
	public ResponseEntity<?> createVolunteer(@RequestBody Volunteer newVolunteer){
		
		Volunteer volunteer = volunteerService.createVolunteer(newVolunteer);
		return new ResponseEntity<Volunteer>(volunteer,HttpStatus.OK);
	}
	
	@GetMapping("/volunteers")
	public ResponseEntity<?> getAllLogs (){
		
		List<Volunteer> hrs = new ArrayList<Volunteer>();
		hrs = volunteerService.getAllVolunteers();
		return new ResponseEntity<List<Volunteer>>(hrs,HttpStatus.OK);
		
	}
	
	@GetMapping("/volunteers/{id}")
	public ResponseEntity<?> getLogById (@PathVariable int id){
		
		Optional<Volunteer> optVolunteer = volunteerService.getVolunteerById(id);
		if(optVolunteer.isPresent()) {
			return new ResponseEntity<Volunteer>(optVolunteer.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	


}
