package com.ford.fp2.ibgepoc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

	private Long id;
	
	private String name;
	
	private String simpleName;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
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
