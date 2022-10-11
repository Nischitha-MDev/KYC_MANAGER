package com.sixdee.kyc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.kyc.entity.SD_KYC_FIELD_MASTER;
import com.sixdee.kyc.repository.SD_KYC_FIELD_MASTER_Repository;
import com.sixdee.kyc.service.SD_KYC_FIELD_MASTER_Service;

@RestController
public class SD_KYC_FIELD_MASTER_Controller {
	
	@Autowired
	SD_KYC_FIELD_MASTER_Service masterService;
	
	@Autowired
	SD_KYC_FIELD_MASTER_Repository masterRepo;
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/add_master_details")
    public SD_KYC_FIELD_MASTER insert(@RequestBody SD_KYC_FIELD_MASTER master)
    {
        return masterService.add(master);
    }
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/update_master_details")
    public SD_KYC_FIELD_MASTER update(@RequestBody SD_KYC_FIELD_MASTER master)
    {
        return masterService.update(master);
    }
	
	@DeleteMapping(value="/delete_master/{fieldId}")
	public String deleteData(@PathVariable int fieldId) {
		return masterService.delete(fieldId);
		
	}
	
	@GetMapping(value="/get_master_details/{fieldId}")
	public SD_KYC_FIELD_MASTER findById(@PathVariable int fieldId) {
		
		if(masterRepo.findById(fieldId).isPresent()) {
			return masterRepo.findById(fieldId).get();
		}
		else
		return null;
		
	}
	
	@GetMapping(value="/get_all_master_details")
	public List<SD_KYC_FIELD_MASTER> findAllById(){
		return masterRepo.findAll();
		
	}

}