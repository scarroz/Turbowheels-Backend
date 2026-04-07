package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;
import java.util.List;

public class FullContractDTO {
    private Long id;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double salario;
    private EmployeeDTO empleado;
    private List<PayrollDTO> nominas;
    
    
    public FullContractDTO() {
		// TODO Auto-generated constructor stub
	}


	public FullContractDTO(String tipo, LocalDate fechaInicio, LocalDate fechaFin, Double salario, EmployeeDTO empleado,
			List<PayrollDTO> nominas) {
		super();
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.salario = salario;
		this.empleado = empleado;
		this.nominas = nominas;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public EmployeeDTO getEmpleado() {
		return empleado;
	}


	public void setEmpleado(EmployeeDTO empleado) {
		this.empleado = empleado;
	}


	public List<PayrollDTO> getNominas() {
		return nominas;
	}


	public void setNominas(List<PayrollDTO> nominas) {
		this.nominas = nominas;
	}
    
    
}
