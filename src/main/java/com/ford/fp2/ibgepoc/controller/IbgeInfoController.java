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

import com.ford.fp2.ibgepoc.IbgeInfoService;
import com.ford.fp2.ibgepoc.dto.IbgeInfo;

@RestController
@RequestMapping("/ibgeInfos")
public class IbgeInfoController {
	
	Logger logger = LoggerFactory.getLogger(IbgeInfoController.class);

	@Autowired
	IbgeInfoService service;

	@GetMapping("/{cep}")
	public ResponseEntity<IbgeInfo> getByCep(@PathVariable @Valid String cep) {

		logger.debug("Chamando servico de BD...");
		
		return Optional.ofNullable(service.getByCep(cep))
		        .map(ResponseEntity::ok)
		        .orElse(ResponseEntity.notFound().build());
	}
	
}
