package co.edu.unbosque.nominabackend.dto;

import java.util.List;

public class FullEmployeeDTO {
	private Long id;
    private String nombre;
    private String apellido;
    private String documento;
    private List<ContractDTO> contratos;
    
    
    public FullEmployeeDTO() {
		// TODO Auto-generated constructor stub
	}


	public FullEmployeeDTO(Long id, String nombre, String apellido, String documento, List<ContractDTO> contratos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.contratos = contratos;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public List<ContractDTO> getContratos() {
		return contratos;
	}


	public void setContratos(List<ContractDTO> contratos) {
		this.contratos = contratos;
	}
    
    
    
    
}
