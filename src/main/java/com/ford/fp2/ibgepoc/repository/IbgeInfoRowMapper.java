package com.ford.fp2.ibgepoc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ford.fp2.ibgepoc.dto.IbgeInfo;

public class IbgeInfoRowMapper implements RowMapper<IbgeInfo> {

	@Override
	public IbgeInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		IbgeInfo ibgeInfo = new IbgeInfo();
		ibgeInfo.setId(rs.getLong("id_cidade"));
		ibgeInfo.setCityName(rs.getString("nome_cidade"));
		ibgeInfo.setCitySimpleName(rs.getString("nome_simples"));
		ibgeInfo.setState(rs.getString("uf"));
		ibgeInfo.setDdd(rs.getShort("ddd"));
		ibgeInfo.setIbgeCode(rs.getLong("cod_ibge"));
		ibgeInfo.setCepMin(rs.getString("cep_min"));
		ibgeInfo.setCepMax(rs.getString("cep_max"));
		
		return ibgeInfo;
	}

}
