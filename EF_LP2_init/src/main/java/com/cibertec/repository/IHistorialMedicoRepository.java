package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.HistorialMedico;

@Repository
public interface IHistorialMedicoRepository extends JpaRepository<HistorialMedico, Long> {

	List<HistorialMedico> findAll();

	
}
