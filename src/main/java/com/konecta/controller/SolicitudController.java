package com.konecta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.konecta.dto.SolicitudYNameEmployDTO;
import com.konecta.model.entity.Solicitud;
import com.konecta.service.iface.SolicitudService;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
	
	@Autowired
	private SolicitudService solicitudS;
	
	
	@GetMapping("/all")
	public List<Solicitud> getAll() {
		return solicitudS.getAll();
	}

	@GetMapping("/emp/{id}")
	public Optional<Solicitud> getById(@PathVariable int id) {
		return solicitudS.getById(id);
	}

	@PostMapping("/insert")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Solicitud insertEmpleado(@RequestBody Solicitud empleado) {
		return solicitudS.insertSolicitud(empleado);
		
	}
	
	@GetMapping("/allemploy")
	public ResponseEntity<Object> getCustomAllSolicitudes() {
		return new ResponseEntity<>(solicitudS.getCustomAllSolicitudes(), HttpStatus.OK);
	}
}

