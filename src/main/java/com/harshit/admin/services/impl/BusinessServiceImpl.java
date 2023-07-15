package com.harshit.admin.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.harshit.admin.payloads.BusinessDto;
import com.harshit.admin.repositories.BusinessRepository;
import com.harshit.admin.services.BusinessService;

public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessRepository businessRepository; 
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public BusinessDto createBusiness(BusinessDto businessDto) {
		
		return null;
	}

}
