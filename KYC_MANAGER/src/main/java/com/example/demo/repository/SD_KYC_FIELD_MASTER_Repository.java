package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.SD_KYC_FIELD_MASTER;

@Repository
public interface SD_KYC_FIELD_MASTER_Repository extends  JpaRepository<SD_KYC_FIELD_MASTER, Integer> {

}
