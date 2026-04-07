package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.*;
@Entity
@Table(name = "social_security")
public class SocialSecurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double pension;
    private Double salud;
    private Double arl;

    // Relación 1:1 con la nómina
    @OneToOne
    @JoinColumn(name = "payroll_id")
    private Payroll payroll;
    
    public SocialSecurity() {
		// TODO Auto-generated constructor stub
	}

	public SocialSecurity(Double pension, Double salud, Double arl, Payroll payroll) {
		super();
		this.pension = pension;
		this.salud = salud;
		this.arl = arl;
		this.payroll = payroll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

	public Double getSalud() {
		return salud;
	}

	public void setSalud(Double salud) {
		this.salud = salud;
	}

	public Double getArl() {
		return arl;
	}

	public void setArl(Double arl) {
		this.arl = arl;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
    
}
