package co.edu.unbosque.nominabackend.dto;

import java.util.Date;

public class AuditoriaDTO {
	private int id;
	private Date fecha;
	private String accion;
	private String autor;
	
	public AuditoriaDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuditoriaDTO(int id, Date fecha, String accion, String autor) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.accion = accion;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
