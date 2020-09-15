package com.smpp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smpp.api.model.Sms;
import com.smpp.api.service.TransceiverService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransceiverController {

	@Autowired
	TransceiverService service;
	@RequestMapping("/create")
	public String create(@RequestParam String shortMessage, @RequestParam String sourceAddr, @RequestParam String destAddr) {
		Sms sms = service.create(shortMessage, sourceAddr, destAddr);
		return sms.toString();
	}
	@RequestMapping("/getAll")
	public List<Sms> getAll(){
		return service.getAll();
	}
}
