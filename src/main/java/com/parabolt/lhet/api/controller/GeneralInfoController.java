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


import com.parabolt.lhet.api.entity.GeneralInfo;

import com.parabolt.lhet.api.service.GeneralInfoService;

@Controller
@CrossOrigin
@RequestMapping("/home")
public class GeneralInfoController {

	@Autowired
	GeneralInfoService generalInfoService;
	
	@PostMapping("/info")
	public ResponseEntity<?> createGeneralInfo(@RequestBody GeneralInfo newAdmin){
		
		GeneralInfo admin = generalInfoService.createInfo(newAdmin);
		return new ResponseEntity<GeneralInfo>(admin,HttpStatus.OK);
	}
	
	@GetMapping("/info")
	public ResponseEntity<?> getAllGeneralInfo (){
		
		List<GeneralInfo> infos = new ArrayList<GeneralInfo>();
		infos = generalInfoService.getAllInfo();
		return new ResponseEntity<List<GeneralInfo>>(infos,HttpStatus.OK);
		
	}
	
	@GetMapping("/info/{id}")
	public ResponseEntity<?> getInfoById (@PathVariable int id){
		
		Optional<GeneralInfo> optGeneralInfo = generalInfoService.getInfoById(id);
		if(optGeneralInfo.isPresent()) {
			return new ResponseEntity<GeneralInfo>(optGeneralInfo.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}
