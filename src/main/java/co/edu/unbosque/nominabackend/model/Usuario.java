package co.edu.unbosque.nominabackend.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "usuario")
public class Usuario {

	@Id
	private String id;

	private String nombre;
	private String apellido;
	private String documento;
	private String email;
	private String pass;
	private int edad;

	public Usuario() {
	}

	public Usuario(String nombre, String apellido, String documento, String email, String password, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.email = email;
		this.pass = password;
		this.edad = edad;
	}

	// Getters y Setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}