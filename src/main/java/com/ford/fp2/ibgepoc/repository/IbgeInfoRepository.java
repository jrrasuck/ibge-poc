package com.ford.fp2.ibgepoc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ford.fp2.ibgepoc.dto.IbgeInfo;

@Repository
public class IbgeInfoRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger logger = LoggerFactory.getLogger(IbgeInfoRepository.class);
	
	public IbgeInfo getByCep(String cep) {
		
		IbgeInfo ibgeInfo = null;
		try {
			ibgeInfo = jdbcTemplate.queryForObject("select * from cidade where cep_min <= ? and cep_max >= ?"
					, new Object[] {cep, cep}, new IbgeInfoRowMapper());
		} catch (EmptyResultDataAccessException ex) {
			logger.warn("Cidade não encontrada com Cep {}", cep);
		}
		return ibgeInfo;
	}
	
}
