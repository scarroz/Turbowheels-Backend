package co.edu.unbosque.nominabackend.dto;

public class CreateEmployeeDTO {
	private String nombre;
	private String apellido;
	private String documento;
	
	public CreateEmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public CreateEmployeeDTO(String nombre, String apellido, String documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
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
	
	
}
