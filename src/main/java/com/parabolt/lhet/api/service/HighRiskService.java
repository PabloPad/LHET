package com.parabolt.lhet.api.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.repository.AdminRepository;



@Service
public class HighRiskService {
	
	@Autowired
	AdminRepository adminRepository;

	public Admin createAdmin(Admin admin) {
		
		return adminRepository.save(admin);
	}
}
