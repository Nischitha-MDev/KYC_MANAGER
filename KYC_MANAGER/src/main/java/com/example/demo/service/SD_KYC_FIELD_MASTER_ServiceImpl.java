package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.SD_KYC_FIELD_MASTER;
import com.example.demo.repository.SD_KYC_FIELD_MASTER_Repository;



@Transactional
@Service
public class SD_KYC_FIELD_MASTER_ServiceImpl implements SD_KYC_FIELD_MASTER_Service{

	
	@Autowired
	private SD_KYC_FIELD_MASTER_Repository masterRepo;
	
	@Override
	public SD_KYC_FIELD_MASTER add(SD_KYC_FIELD_MASTER data) {
		SD_KYC_FIELD_MASTER master=new SD_KYC_FIELD_MASTER();
		master.setDropdown(data.getDropdown());
		master.setFieldType(data.getFieldType());
		master.setName(data.getName());
		master.setTagType(data.getTagType());
		return masterRepo.save(master);
	}

	@Override
	public SD_KYC_FIELD_MASTER update(SD_KYC_FIELD_MASTER data) {
		SD_KYC_FIELD_MASTER master=new SD_KYC_FIELD_MASTER();
		master.setId(data.getId());
		master.setDropdown(data.getDropdown());
		master.setFieldType(data.getFieldType());
		master.setName(data.getName());
		master.setTagType(data.getTagType());
		return masterRepo.save(master);
	}

	@Override
	public String delete(int id) {
		masterRepo.deleteById(id);
		return "Entity deleted "+id;
	}

	@Override
	public SD_KYC_FIELD_MASTER get(int id) {
		
		return masterRepo.findById(id).get();
	}

}