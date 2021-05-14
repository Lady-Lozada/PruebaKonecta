package com.konecta.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SOL")
	private int id;
	
	@Column(name = "CODIGO")
	private String codSol;
	
	@Column(name = "DESCRIPCION")
	private String descSol;
	
	private String resumen;
	
	@ManyToOne
	@JoinColumn(name = "ID_EMPLEADO")
	private Empleado idEmpl; // Foreign key

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Empleado getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(Empleado idEmpl) {
		this.idEmpl = idEmpl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
