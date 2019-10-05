package com.ford.fp2.ibgepoc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	//select * from cidade where cep_min >= ? and cep_max <= ?
	
	public City getByCep(String cep) {
		
		City city = jdbcTemplate.queryForObject("select * from cidade where id_cidade = ?"
				, new Object[] {cep}, new CityRowMapper());
		return city;
	}
	
	public City getByCepFromRest(String cep) {
		
		City city = restTemplate.getForObject(
				ibgeServiceUrl + "/04500200", City.class);
		return city;
	}

}
