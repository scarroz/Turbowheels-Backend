package co.edu.unbosque.nominabackend.dto;

public class DeductionDTO {
    private Long id;
    private String tipo;
    private Double valor;
    
    
    public DeductionDTO() {
		// TODO Auto-generated constructor stub
	}


	public DeductionDTO(String tipo, Double valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
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


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
    
    
}