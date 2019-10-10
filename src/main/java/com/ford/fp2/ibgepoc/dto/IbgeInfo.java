package com.ford.fp2.ibgepoc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IbgeInfo {

	private Long id;
	
	private String cityName;
	
	private String citySimpleName;
	
	private String state;
	
	private Short ddd;
	
	private Long ibgeCode;
	
	private String cepMin;
	
	private String cepMax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCitySimpleName() {
		return citySimpleName;
	}

	public void setCitySimpleName(String citySimpleName) {
		this.citySimpleName = citySimpleName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Short getDdd() {
		return ddd;
	}

	public void setDdd(Short ddd) {
		this.ddd = ddd;
	}

	public Long getIbgeCode() {
		return ibgeCode;
	}

	public void setIbgeCode(Long ibgeCode) {
		this.ibgeCode = ibgeCode;
	}

	public String getCepMin() {
		return cepMin;
	}

	public void setCepMin(String cepMin) {
		this.cepMin = cepMin;
	}

	public String getCepMax() {
		return cepMax;
	}

	public void setCepMax(String cepMax) {
		this.cepMax = cepMax;
	}
	
}
