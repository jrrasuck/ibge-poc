package com.ford.fp2.ibgepoc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ford.fp2.ibgepoc.dto.City;

@Repository
public class CityRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${ibge.service.url}")
	private String ibgeServiceUrl;
	
	Logger logger = LoggerFactory.getLogger(CityRepository.class);
	
	public City getByCep(String cep) {
		
		City city = null;
		try {
			city = jdbcTemplate.queryForObject("select * from cidade where cep_min <= ? and cep_max >= ?"
					, new Object[] {cep, cep}, new CityRowMapper());
		} catch (EmptyResultDataAccessException ex) {
			logger.warn("Cidade não encontrada com Cep {}", cep);
		}
		
		return city;
	}
	
	public City getByCepFromRest(String cep) {
		
		City city = restTemplate.getForObject(
				ibgeServiceUrl + "/" + cep, City.class);
		return city;
	}

}
