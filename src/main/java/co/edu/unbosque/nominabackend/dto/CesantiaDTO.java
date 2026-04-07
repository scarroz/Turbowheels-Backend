package co.edu.unbosque.nominabackend.dto;

public class CesantiaDTO {
	private Long id;
	private Double valor;

	public CesantiaDTO() {
		// TODO Auto-generated constructor stub
	}

	public CesantiaDTO(Double valor) {
		super();
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
