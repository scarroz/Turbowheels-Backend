package co.edu.unbosque.nominabackend.dto;

public class SocialSecurityDTO {
	private Long id;
	private Double pension;
	private Double salud;
	private Double arl;

	public SocialSecurityDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SocialSecurityDTO(Double pension, Double salud, Double arl) {
		super();
		this.pension = pension;
		this.salud = salud;
		this.arl = arl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

	public Double getSalud() {
		return salud;
	}

	public void setSalud(Double salud) {
		this.salud = salud;
	}

	public Double getArl() {
		return arl;
	}

	public void setArl(Double arl) {
		this.arl = arl;
	}
	
	
}
