package com.konecta.model.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EMP")
	private int id;
	
	@Column(name = "FECHA_INGRESO")
	private LocalDate dateinit;
	
	@Column(name = "NOMBRE")
	private String name;
	
	@Column(name = "SALARIO")
	private long salary;

	
	public Empleado() {}
	
	public Empleado(int id, LocalDate dateinit, String name, long salary) {
		super();
		this.id = id;
		this.dateinit = dateinit;
		this.name = name;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateinit() {
		return dateinit;
	}

	public void setDateinit(LocalDate dateinit) {
		this.dateinit = dateinit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
