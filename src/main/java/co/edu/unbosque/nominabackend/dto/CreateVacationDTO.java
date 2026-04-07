package co.edu.unbosque.nominabackend.dto;

public class CreateVacationDTO {
	private Integer dias;
	private String disfrute;
	private Long payrollId;

	public CreateVacationDTO() {
	}

	public CreateVacationDTO(Integer dias, String disfrute, Long payrollId) {
		this.dias = dias;
		this.disfrute = disfrute;
		this.payrollId = payrollId;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public String getDisfrute() {
		return disfrute;
	}

	public void setDisfrute(String disfrute) {
		this.disfrute = disfrute;
	}

	public Long getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

}
