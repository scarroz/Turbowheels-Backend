package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;

public class FullFinalSettlementDTO {
	private Long id;
	private LocalDate fechaFinal;
	private Double valorPagado;

	public FullFinalSettlementDTO() {
		// TODO Auto-generated constructor stub
	}

	public FullFinalSettlementDTO(Long id, LocalDate fechaFinal, Double valorPagado) {
		super();
		this.id = id;
		this.fechaFinal = fechaFinal;
		this.valorPagado = valorPagado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Double getValorPagado() {
		return valorPagado;
	}

	public void setValorPagado(Double valorPagado) {
		this.valorPagado = valorPagado;
	}

}
