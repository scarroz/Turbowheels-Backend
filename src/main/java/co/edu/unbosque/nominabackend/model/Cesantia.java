package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.*;


@Entity
@Table(name = "cesantia")
public class Cesantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;

    // Relación 1:1 con la nómina
    @OneToOne
    @JoinColumn(name = "payroll_id")
    private Payroll payroll;
    
    public Cesantia() {
		// TODO Auto-generated constructor stub
	}

	public Cesantia(Double valor, Payroll payroll) {
		super();
		this.valor = valor;
		this.payroll = payroll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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