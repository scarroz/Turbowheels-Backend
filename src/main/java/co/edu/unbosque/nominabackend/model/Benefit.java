package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "benefit")
public class Benefit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;
	private Double valor;

	// Muchas prestaciones pertenecen a una nómina
	@ManyToOne
	@JoinColumn(name = "payroll_id")
	private Payroll payroll;

	public Benefit() {
		// TODO Auto-generated constructor stub
	}

	public Benefit(String tipo, Double valor, Payroll payroll) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.payroll = payroll;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

}
