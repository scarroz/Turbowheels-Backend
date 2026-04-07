package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;

public class EmployeeDTO {
	private long id;
	private String nombre;
	private String apellido;
	private String documento;
	private String tipoDocumento;
	private LocalDate fechaNacimiento;
	private String sexo;
	private String direccion;
	private String telefono;

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String nombre, String apellido, String documento, String tipoDocumento,
			LocalDate fechaNacimiento, String sexo, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}