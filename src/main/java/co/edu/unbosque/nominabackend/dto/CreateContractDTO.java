package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;

public class CreateContractDTO {
	private String tipo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Double salario;
	private Long employeeId;
	
	public CreateContractDTO() {
		// TODO Auto-generated constructor stub
	}

	public CreateContractDTO(String tipo, LocalDate fechaInicio, LocalDate fechaFin, Double salario, Long employeeId) {
		super();
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.salario = salario;
		this.employeeId = employeeId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
