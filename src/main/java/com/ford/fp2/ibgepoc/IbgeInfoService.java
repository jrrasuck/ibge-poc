package com.ford.fp2.ibgepoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ford.fp2.ibgepoc.dto.IbgeInfo;
import com.ford.fp2.ibgepoc.repository.IbgeInfoRepository;

@Service
public class IbgeInfoService {
	
	@Autowired
	private IbgeInfoRepository repository;
	
	public IbgeInfo getByCep(String cep) {
		
		// Retornar com Optional e map
		IbgeInfo ibgeInfo = repository.getByCep(cep);
		return ibgeInfo;
	}

}
