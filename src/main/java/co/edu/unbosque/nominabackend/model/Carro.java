package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Carro")
public class Carro {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String marca;
	private String modelo;
	private int year;
	private float km;
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public Carro(String marca, String modelo, int year, float km) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.km = km;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	
	
}
