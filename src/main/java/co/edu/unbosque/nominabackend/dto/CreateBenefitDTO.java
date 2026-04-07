package co.edu.unbosque.nominabackend.dto;

public class CreateBenefitDTO {
	private String tipo;
	private Double valor;
	private Long payrollId;

	public CreateBenefitDTO() {
	}

	public CreateBenefitDTO(String tipo, Double valor, Long payrollId) {
		this.tipo = tipo;
		this.valor = valor;
		this.payrollId = payrollId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Long getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}
}
