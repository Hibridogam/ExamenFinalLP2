package com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {



}
