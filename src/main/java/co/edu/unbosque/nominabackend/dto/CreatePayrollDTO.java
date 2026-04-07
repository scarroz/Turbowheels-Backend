package co.edu.unbosque.nominabackend.dto;

public class CreatePayrollDTO {
	private Long contractId;
	public CreatePayrollDTO() {
		// TODO Auto-generated constructor stub
	}
	public CreatePayrollDTO(Long contractId) {
		super();
		this.contractId = contractId;
	}
	public Long getContractId() {
		return contractId;
	}
	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}
	
	
}
