package com.konecta.service.iface;

import java.util.List;
import java.util.Optional;

import com.konecta.dto.SolicitudYNameEmployDTO;
import com.konecta.model.entity.Solicitud;

public interface SolicitudService {

	/**
	 * Listar todas las solicitudes
	 * @return
	 */
	public List<Solicitud> getAll();
	
	/**
	 * consultar una solicitud por su id
	 * @param empleado
	 * @param id
	 */
	public Optional<Solicitud> getById(int id);
	
	/**
	 * Insertar un empleado
	 * @param Empleado
	 * @throws Exception 
	 */
	public Solicitud insertSolicitud(Solicitud sol) throws Exception;
	
	/**
	 * Listar todas las solicitudes con nombre de empleado
	 * @return
	 */
	public List<SolicitudYNameEmployDTO> getCustomAllSolicitudes();
}
