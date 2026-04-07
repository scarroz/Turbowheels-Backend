package co.edu.unbosque.nominabackend.dto;

public class IncapacityDTO {
    private Long id;
    private String tipo;
    private Integer dias;
    private Double valorPagado;
    private String nombreEps;
    
    
    public IncapacityDTO() {
		// TODO Auto-generated constructor stub
	}


	public IncapacityDTO(String tipo, Integer dias, Double valorPagado, String nombreEps) {
		super();
		this.tipo = tipo;
		this.dias = dias;
		this.valorPagado = valorPagado;
		this.nombreEps = nombreEps;
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


	public String getNombreEps() {
		return nombreEps;
	}


	public void setNombreEps(String nombreEps) {
		this.nombreEps = nombreEps;
	}
    
    
}
