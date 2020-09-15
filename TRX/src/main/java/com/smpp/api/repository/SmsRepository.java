package com.smpp.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smpp.api.model.Sms;



@Repository
public interface SmsRepository extends MongoRepository<Sms, String> {
	
	

}
