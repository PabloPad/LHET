package com.parabolt.lhet.api.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parabolt.lhet.api.entity.Admin;
import com.parabolt.lhet.api.entity.GeneralInfo;
import com.parabolt.lhet.api.repository.AdminRepository;
import com.parabolt.lhet.api.repository.GeneralInfoRepository;



@Service
public class GeneralInfoService {
	
	@Autowired
	GeneralInfoRepository generalInfoRepository;

	public GeneralInfo createInfo(GeneralInfo info) {
		
		return generalInfoRepository.save(info);
	}
	
	
	public List<GeneralInfo> getAllInfo() {
		
		return generalInfoRepository.findAll();
	}
	
	public Optional<GeneralInfo> getInfoById(int id) {
		
		return generalInfoRepository.findById(id);
	}
}
