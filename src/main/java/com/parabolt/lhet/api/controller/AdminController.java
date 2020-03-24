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
	
	@GetMapping("/admins/{id}")
	public ResponseEntity<?> getAdminById (@PathVariable int id){
		
		Optional<Admin> optAdmin = adminService.getAdminById(id);
		if(optAdmin.isPresent()) {
			return new ResponseEntity<Admin>(optAdmin.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}


}
