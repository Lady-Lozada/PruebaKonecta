package com.konecta.service.impls;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.konecta.dto.SolicitudYNameEmployDTO;
import com.konecta.model.entity.Solicitud;
import com.konecta.model.repository.SolicitudRepository;
import com.konecta.service.iface.SolicitudService;

@Service
public class SolicitudServiceImpls implements SolicitudService{

	@Autowired
	private SolicitudRepository solicitudR;
	
	@Override
	@Transactional
	public List<Solicitud> getAll() {
		List<Solicitud> solicitudes = new ArrayList<>();
		solicitudes = (List<Solicitud>) solicitudR.findAll();
		return solicitudes;
	}

	@Override
	public Solicitud insertSolicitud(Solicitud sol) {
		boolean exist = solicitudR.existsById(sol.getId());
		if(!exist) {
			solicitudR.save(sol);
		}
		return sol;
	}

	@Override
	public Optional<Solicitud> getById(int id) {
		return solicitudR.findById(id);
	}

	
	public List<SolicitudYNameEmployDTO> getCustomAllSolicitudes() {
		List<Solicitud> solicitudes = getAll();
		List<SolicitudYNameEmployDTO> solsDTO = new ArrayList<SolicitudYNameEmployDTO>();
		SolicitudYNameEmployDTO solDTO = new SolicitudYNameEmployDTO();
		
		for (Solicitud sol: solicitudes) {
			solDTO.setIdSol(sol.getId());
			solDTO.setCodSol(sol.getCodSol());
			solDTO.setDescSol(sol.getDescSol());
			solDTO.setResumen(sol.getResumen());
			solDTO.setNameEmploy(sol.getIdEmpl().getName());
			solsDTO.add(solDTO);
		}
		return solsDTO;
	}
	
	
}
