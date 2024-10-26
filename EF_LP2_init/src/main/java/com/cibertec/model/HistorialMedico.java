package com.cibertec.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HistorialMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String diagnostico;
    private Date fecha;
    private String tratamientosPrevios;
    private String alergias;
    private String medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

	public HistorialMedico(Long id, String diagnostico, Date fecha, String tratamientosPrevios, String alergias,
			String medico, Paciente paciente) {
		super();
		this.id = id;
		this.diagnostico = diagnostico;
		this.fecha = fecha;
		this.tratamientosPrevios = tratamientosPrevios;
		this.alergias = alergias;
		this.medico = medico;
		this.paciente = paciente;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTratamientosPrevios() {
		return tratamientosPrevios;
	}
	public void setTratamientosPrevios(String tratamientosPrevios) {
		this.tratamientosPrevios = tratamientosPrevios;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}   
}
