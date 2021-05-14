package com.konecta.service.iface;

import java.util.List;
import java.util.Optional;

import com.konecta.model.entity.Empleado;


public interface EmpleadoService {

	/**
	 * Listar todos los empleados
	 * @return
	 */
	public List<Empleado> getAll();
	
	/**
	 * consultar un empleado por su id
	 * @param empleado
	 * @param id
	 */
	public Optional<Empleado> getById(int id);
	
	/**
	 * Insertar un empleado
	 * @param Empleado
	 * @throws Exception 
	 */
	public Empleado insertEmpleado(Empleado empleado) throws Exception;
	
	
}
