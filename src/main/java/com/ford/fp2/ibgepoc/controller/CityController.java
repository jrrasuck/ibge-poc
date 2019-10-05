package com.ford.fp2.ibgepoc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ford.fp2.ibgepoc.dto.City;
import com.ford.fp2.ibgepoc.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	Logger logger = LoggerFactory.getLogger(CityController.class);

	@Autowired
	CityRepository repository;

	@GetMapping("/{cep}")
	public City getByCep(String cep) {

		logger.info("Chamando servico de BD...");
		
		 City city = repository.getByCep(cep);
		 
		 return city;
	}
	
	@GetMapping("/fromRestService/{cep}")
	public City getByCepFromRest(String cep) {

		logger.info("Chamando servico de RestService...");
		
		City city = repository.getByCep(cep);
		
		return city;
	}

}
