package co.edu.unbosque.nominabackend.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String apellido;
	private String documento;

	private String tipoDocumento;
	private LocalDate fechaNacimiento;
	private String sexo;
	private String direccion;
	private String telefono;

	// Un empleado tiene solo un contrato
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	private Contract contract;

	public Employee() {
	}

	public Employee(String nombre, String apellido, String documento, String tipoDocumento, LocalDate fechaNacimiento,
			String sexo, String direccion, String telefono, Contract contract) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contract = contract;
	}

	// Getters y Setters

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

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}