package com.konecta.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.konecta.model.entity.Empleado;
import com.konecta.service.iface.EmpleadoService;

@RestController
public class EmpleadoFrontController {
	
	@Autowired
	private EmpleadoService empleadoS;
	
	/*@RequestMapping("/hola")
	  public String hola(@RequestParam(name="name", required=false, defaultValue="world") String name, Model modelo) {
		Optional<Empleado> empleado= empleadoS.getById(cant);
	    modelo.addAttribute("empleado", empleado.get().getId());
	    return "hola";
	  }*/
	@GetMapping("/todos")
	  public Iterable<Empleado> getAllTodos(Model modelo) {
		Iterable<Empleado> todos = empleadoS.getAll();
	    //modelo.addAttribute("todos", todos);
	    return todos;
	  }
	
}
