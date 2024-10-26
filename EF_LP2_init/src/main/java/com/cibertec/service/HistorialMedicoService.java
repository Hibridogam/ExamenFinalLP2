package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.HistorialMedico;
import com.cibertec.repository.IHistorialMedicoRepository;

@Service
public class HistorialMedicoService {

	  @Autowired
	    private IHistorialMedicoRepository historialMedicoRepository;


	    public HistorialMedico registrarHistorialMedico(HistorialMedico historialMedico) {
	        return historialMedicoRepository.save(historialMedico);
	    }


	    public List<HistorialMedico> obtenerTodoElHistorial() {
	        return historialMedicoRepository.findAll();
	    }


	    public Optional<HistorialMedico> obtenerHistorialPorPaciente(Long pacienteId) {
	        return historialMedicoRepository.findById(pacienteId);
	    }
}
