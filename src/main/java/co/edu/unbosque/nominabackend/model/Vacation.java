package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "vacation")
public class Vacation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer dias;
	private String disfrute; // Puede ser una descripción o el estado del disfrute

	// Muchas vacaciones pertenecen a una nómina
	@ManyToOne
	@JoinColumn(name = "payroll_id")
	private Payroll payroll;
	
	public Vacation() {
		// TODO Auto-generated constructor stub
	}

	public Vacation(Integer dias, String disfrute, Payroll payroll) {
		super();
		this.dias = dias;
		this.disfrute = disfrute;
		this.payroll = payroll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public String getDisfrute() {
		return disfrute;
	}

	public void setDisfrute(String disfrute) {
		this.disfrute = disfrute;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	
	
}
