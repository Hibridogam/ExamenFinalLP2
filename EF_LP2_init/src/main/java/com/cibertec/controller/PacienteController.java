package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Paciente;
import com.cibertec.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
    private PacienteService pacienteService;

    @PostMapping("/registrar")
    public ResponseEntity<Paciente> registrarPaciente(@RequestBody Paciente paciente) {
        Paciente nuevoPaciente = pacienteService.registrarPaciente(paciente);
        return new ResponseEntity<>(nuevoPaciente, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public List<Paciente> obtenerTodosLosPacientes() {
        return pacienteService.obtenerTodosLosPacientes();
    }
}
