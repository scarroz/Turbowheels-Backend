package co.edu.unbosque.nominabackend.dto;

public class VacationDTO {
	private Long id;
	private Integer dias;
	private String disfrute;

	public VacationDTO() {
		// TODO Auto-generated constructor stub
	}

	public VacationDTO(Integer dias, String disfrute) {
		super();
		this.dias = dias;
		this.disfrute = disfrute;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}