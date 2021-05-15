package com.konecta.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudYNameEmployDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("IdSol")
	private int idSol;
	
	@JsonProperty("CodSol")
	private String codSol;
	
	@JsonProperty("DescSol")
	private String descSol;
	
	@JsonProperty("Resumen")
	private String resumen;
	
	@JsonProperty("NameEmploy")
	private String nameEmploy;

	public int getIdSol() {
		return idSol;
	}

	public void setIdSol(int idSol) {
		this.idSol = idSol;
	}

	public String getCodSol() {
		return codSol;
	}

	public void setCodSol(String codSol) {
		this.codSol = codSol;
	}

	public String getDescSol() {
		return descSol;
	}

	public void setDescSol(String descSol) {
		this.descSol = descSol;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getNameEmploy() {
		return nameEmploy;
	}

	public void setNameEmploy(String nameEmploy) {
		this.nameEmploy = nameEmploy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}
