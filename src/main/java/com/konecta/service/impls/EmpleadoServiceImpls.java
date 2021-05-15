package com.konecta.service.impls;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konecta.model.entity.Empleado;
import com.konecta.model.repository.EmpleadoRepository;
import com.konecta.service.iface.EmpleadoService;

@Service
public class EmpleadoServiceImpls implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoR;
	
	@Override
	public List<Empleado> getAll() {
		List<Empleado> empleados = new ArrayList<>();
		empleados = (List<Empleado>) empleadoR.findAll();
		return empleados;
	}

	@Override
	@Transactional
	public Optional<Empleado> getById(int id) {
		return empleadoR.findById(id);
	}

	public Empleado insertEmpleado(Empleado empleado) throws Exception {
		boolean exist = empleadoR.existsById(empleado.getId());
		if(!exist) {
			empleadoR.save(empleado);
		}else {
			throw new Exception("El empleado ya existe");
		}
		return empleado;
	}
	

}
