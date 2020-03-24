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


import com.parabolt.lhet.api.entity.VisitLog;

import com.parabolt.lhet.api.service.VisitLogService;

@Controller
@CrossOrigin
@RequestMapping("/home")
public class VisitLogController {

	@Autowired
	VisitLogService visitLogService;
	
	@PostMapping("/logs")
	public ResponseEntity<?> createVisitLog(@RequestBody VisitLog newVisitLog){
		
		VisitLog visitLog = visitLogService.createVisitLog(newVisitLog);
		return new ResponseEntity<VisitLog>(visitLog,HttpStatus.OK);
	}
	
	@GetMapping("/logs")
	public ResponseEntity<?> getAllLogs (){
		
		List<VisitLog> hrs = new ArrayList<VisitLog>();
		hrs = visitLogService.getAllLogs();
		return new ResponseEntity<List<VisitLog>>(hrs,HttpStatus.OK);
		
	}
	
	@GetMapping("/logs/{id}")
	public ResponseEntity<?> getLogById (@PathVariable int id){
		
		Optional<VisitLog> optVisitLog = visitLogService.getLogById(id);
		if(optVisitLog.isPresent()) {
			return new ResponseEntity<VisitLog>(optVisitLog.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	


}
