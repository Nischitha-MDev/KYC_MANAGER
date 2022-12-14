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
import com.sixdee.kyc.entity.SD_KYC_FIELD_TYPES;
import com.sixdee.kyc.repository.SD_KYC_FIELD_MASTER_Repository;
import com.sixdee.kyc.repository.SD_KYC_FIELD_TYPES_Repository;
import com.sixdee.kyc.service.SD_KYC_FIELD_MASTER_Service;
import com.sixdee.kyc.service.SD_KYC_FIELD_TYPES_Service;

@RestController
public class SD_KYC_FIELD_TYPES_Controller {

	@Autowired
	private SD_KYC_FIELD_TYPES_Service service;
	
	@Autowired
	private SD_KYC_FIELD_TYPES_Repository repo;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/SD_KYC_FIELD_TYPES/add")
	public SD_KYC_FIELD_TYPES insert(@RequestBody SD_KYC_FIELD_TYPES master)
	{
		return service.add(master);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/SD_KYC_FIELD_TYPES/update")
	public SD_KYC_FIELD_TYPES update(@RequestBody SD_KYC_FIELD_TYPES master)
	{
		return service.update(master);
	}
	
	@DeleteMapping(path ="/SD_KYC_FIELD_TYPES/delete/{id}")
	public String deleteAddress(@PathVariable int id)
	{
		return service.delete(id);
	}
	
	@GetMapping(value="/SD_KYC_FIELD_TYPES/find/{id}")
	public SD_KYC_FIELD_TYPES findbyId(@PathVariable int id){

		if(repo.findById(id).isPresent())
		{
			return repo.findById(id).get();
		}
		else
			return null;
	}
	
	@GetMapping(value="/SD_KYC_FIELD_TYPES/find")
	public List<SD_KYC_FIELD_TYPES> findAllbyId(){
		return repo.findAll();
	}
}