package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Paciente;
import com.cibertec.repository.IPacienteRepository;

@Service
public class PacienteService {

	 @Autowired
	    private IPacienteRepository pacienteRepository;

	    public Paciente registrarPaciente(Paciente paciente) {
	        return pacienteRepository.save(paciente);
	    }

	    public List<Paciente> obtenerTodosLosPacientes() {
	        return pacienteRepository.findAll();
	    }
	
}
