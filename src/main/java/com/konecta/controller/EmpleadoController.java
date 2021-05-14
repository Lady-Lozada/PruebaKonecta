package com.konecta.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.konecta.model.entity.Empleado;
import com.konecta.service.iface.EmpleadoService;

@RestController
@RequestMapping("/consulta")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoS;
	
	@GetMapping("/all")
	public List<Empleado> getAll() {
		return empleadoS.getAll();
	}

	@GetMapping("/emp/{id}")
	public Optional<Empleado> getById(@PathVariable int id) {
		return empleadoS.getById(id);
	}

	@PostMapping("/insert")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Empleado insertEmpleado(@RequestBody Empleado empleado) throws Exception {
		System.out.println("Entro al método insert de empleado controller");
		return empleadoS.insertEmpleado(empleado);
		
	}
}
