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


import com.parabolt.lhet.api.entity.HighRisk;

import com.parabolt.lhet.api.service.HighRiskService;

@Controller
@CrossOrigin
@RequestMapping("/home")
public class HighRiskController {

	@Autowired
	HighRiskService highRiskService;
	
	@PostMapping("/risks")
	public ResponseEntity<?> createHighRisk(@RequestBody HighRisk newHighRisk){
		
		HighRisk admin = highRiskService.createHighRisk(newHighRisk);
		return new ResponseEntity<HighRisk>(admin,HttpStatus.OK);
	}
	
	@GetMapping("/risks")
	public ResponseEntity<?> getAllhighRisk (){
		
		List<HighRisk> hrs = new ArrayList<HighRisk>();
		hrs = highRiskService.getAllHighRisks();
		return new ResponseEntity<List<HighRisk>>(hrs,HttpStatus.OK);
		
	}
	
	@GetMapping("/risks/{id}")
	public ResponseEntity<?> getInfoById (@PathVariable int id){
		
		Optional<HighRisk> optHighRisk = highRiskService.getHighRiskById(id);
		if(optHighRisk.isPresent()) {
			return new ResponseEntity<HighRisk>(optHighRisk.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	


}
