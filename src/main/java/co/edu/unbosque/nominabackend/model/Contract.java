package co.edu.unbosque.nominabackend.model;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Double salario;

	// Un contrato pertenecen a un empleado
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	// Un contrato puede tener muchas nóminas
	@OneToMany(mappedBy = "contract", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Payroll> payrolls;

	public Contract() {
		// TODO Auto-generated constructor stub
	}

	public Contract(String tipo, LocalDate fechaInicio, LocalDate fechaFin, Double salario, Employee employee,
			List<Payroll> payrolls) {
		super();
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.salario = salario;
		this.employee = employee;
		this.payrolls = payrolls;
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

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Payroll> getPayrolls() {
		return payrolls;
	}

	public void setPayrolls(List<Payroll> payrolls) {
		this.payrolls = payrolls;
	}

}