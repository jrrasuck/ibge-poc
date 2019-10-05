package com.ford.fp2.ibgepoc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ford.fp2.ibgepoc.dto.City;

public class CityRowMapper implements RowMapper<City> {

	@Override
	public City mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		City city = new City();
		city.setId(rs.getLong("id_cidade"));
		city.setName(rs.getString("nome_cidade"));
		city.setSimpleName(rs.getString("nome_simples"));
		city.setState(rs.getString("uf"));
		city.setDdd(rs.getShort("ddd"));
		city.setIbgeCode(rs.getLong("cod_ibge"));
		city.setCepMin(rs.getString("cep_min"));
		city.setCepMax(rs.getString("cep_max"));
		
		return city;
	}

}
