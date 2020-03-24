package com.parabolt.lhet.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parabolt.academyHackaton.back1.entity.Quest;
import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.service.AdminService;

@Controller
@CrossOrigin
@RequestMapping("/home")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/admins")
	public ResponseEntity<?> createAdmin(@RequestBody Admin newAdmin){
		
		Admin admin = adminService.createAdmin(newAdmin);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK);
	}
	
	@GetMapping("/admins")
	public ResponseEntity<?> getAllAdmins (){
		
		List<Admin> quests = new ArrayList<Admin>();
		quests = adminService.getAllAdmins();
		return new ResponseEntity<List<Admin>>(quests,HttpStatus.OK);
		
	}


}
