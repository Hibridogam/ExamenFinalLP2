package com.cibertec.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.HistorialMedico;
import com.cibertec.service.HistorialMedicoService;

@RestController
@RequestMapping("/historial-medico")
public class HistorialMedicoController {

    @Autowired
    private HistorialMedicoService historialMedicoService;

    @PostMapping("/registrar")
    public ResponseEntity<HistorialMedico> registrarHistorialMedico(@RequestBody HistorialMedico historialMedico) {
        HistorialMedico nuevoHistorial = historialMedicoService.registrarHistorialMedico(historialMedico);
        return new ResponseEntity<>(nuevoHistorial, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public List<HistorialMedico> obtenerTodoElHistorial() {
        return historialMedicoService.obtenerTodoElHistorial();
    }


    @GetMapping("/paciente/{pacienteId}")
    public Optional<HistorialMedico> obtenerHistorialPorPaciente(@PathVariable Long pacienteId) {
        return historialMedicoService.obtenerHistorialPorPaciente(pacienteId);
    }
}
