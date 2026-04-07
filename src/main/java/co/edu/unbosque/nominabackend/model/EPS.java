package co.edu.unbosque.nominabackend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "eps")
public class EPS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	// Una EPS tiene muchas incapacidades
	@OneToMany(mappedBy = "eps", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Incapacity> incapacities;

	public EPS() {
		// TODO Auto-generated constructor stub
	}

	public EPS(String nombre, List<Incapacity> incapacities) {
		super();
		this.nombre = nombre;
		this.incapacities = incapacities;
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

	public List<Incapacity> getIncapacities() {
		return incapacities;
	}

	public void setIncapacities(List<Incapacity> incapacities) {
		this.incapacities = incapacities;
	}

}
