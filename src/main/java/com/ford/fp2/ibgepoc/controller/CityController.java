package com.ford.fp2.ibgepoc.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<City> getByCep(@PathVariable @Valid String cep) {

		logger.info("Chamando servico de BD...");
		
		return Optional.ofNullable(repository.getByCep(cep))
		        .map(ResponseEntity::ok)
		        .orElse(ResponseEntity.notFound().build());
		
	}
	
	@GetMapping("/fromRestService/{cep}")
	public ResponseEntity<City> getByCepFromRest(@PathVariable @Valid String cep) {

		logger.info("Chamando servico de RestService...");
		
		return Optional.ofNullable(repository.getByCepFromRest(cep))
		        .map(ResponseEntity::ok)
		        .orElse(ResponseEntity.notFound().build());
	}

}
