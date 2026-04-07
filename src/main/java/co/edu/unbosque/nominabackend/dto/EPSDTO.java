package co.edu.unbosque.nominabackend.dto;

public class EPSDTO {
    private Long id;
    private String nombre;
    
    public EPSDTO() {
		// TODO Auto-generated constructor stub
	}

	public EPSDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}

