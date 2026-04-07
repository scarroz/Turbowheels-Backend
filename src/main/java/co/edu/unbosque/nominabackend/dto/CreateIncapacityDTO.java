package co.edu.unbosque.nominabackend.dto;

public class CreateIncapacityDTO {
	private String tipo;
	private Integer dias;
	private Double valorPagado;
	private Long epsId;
	private Long payrollId;

	public CreateIncapacityDTO() {
	}

	public CreateIncapacityDTO(String tipo, Integer dias, Double valorPagado, Long epsId, Long payrollId) {
		this.tipo = tipo;
		this.dias = dias;
		this.valorPagado = valorPagado;
		this.epsId = epsId;
		this.payrollId = payrollId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Double getValorPagado() {
		return valorPagado;
	}

	public void setValorPagado(Double valorPagado) {
		this.valorPagado = valorPagado;
	}

	public Long getEpsId() {
		return epsId;
	}

	public void setEpsId(Long epsId) {
		this.epsId = epsId;
	}

	public Long getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

}
