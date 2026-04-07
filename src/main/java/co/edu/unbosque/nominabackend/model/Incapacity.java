package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "incapacity")
public class Incapacity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;
	private Integer dias;
	private Double valorPagado;

	// Muchas incapacidades pertenecen a una nómina
	@ManyToOne
	@JoinColumn(name = "payroll_id")
	private Payroll payroll;

	// Muchas incapacidades pueden estar asociadas a una EPS
	@ManyToOne
	@JoinColumn(name = "eps_id")
	private EPS eps;

	public Incapacity() {
		// TODO Auto-generated constructor stub
	}

	public Incapacity(String tipo, Integer dias, Double valorPagado, Payroll payroll, EPS eps) {
		super();
		this.tipo = tipo;
		this.dias = dias;
		this.valorPagado = valorPagado;
		this.payroll = payroll;
		this.eps = eps;
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

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Double getValorPagado() {
		return valorPagado;
	}

	public void setValorPagado(Double valorPagado) {
		this.valorPagado = valorPagado;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

	public EPS getEps() {
		return eps;
	}

	public void setEps(EPS eps) {
		this.eps = eps;
	}

}
