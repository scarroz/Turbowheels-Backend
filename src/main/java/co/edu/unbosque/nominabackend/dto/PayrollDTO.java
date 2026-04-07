package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;

public class  PayrollDTO {
    private Long id;
    private Double totalPagado;
    private LocalDate fecha;
    private Long contractId;
    
    
    public PayrollDTO() {
		// TODO Auto-generated constructor stub
	}


	public PayrollDTO(Double totalPagado, LocalDate fecha, Long contractId) {
		super();
		this.totalPagado = totalPagado;
		this.fecha = fecha;
		this.contractId = contractId;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getTotalPagado() {
		return totalPagado;
	}


	public void setTotalPagado(Double totalPagado) {
		this.totalPagado = totalPagado;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Long getContractId() {
		return contractId;
	}


	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
    
    
    
    
}
