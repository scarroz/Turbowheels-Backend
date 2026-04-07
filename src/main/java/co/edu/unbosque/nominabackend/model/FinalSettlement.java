package co.edu.unbosque.nominabackend.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "final_settlement")
public class FinalSettlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorTotal;
    private LocalDate fechaFinal;

    // Relación 1:1 con la nómina
    @OneToOne
    @JoinColumn(name = "payroll_id")
    private Payroll payroll;
    
    public FinalSettlement() {
		// TODO Auto-generated constructor stub
	}

	public FinalSettlement(Double valorTotal, LocalDate fechaFinal, Payroll payroll) {
		super();
		this.valorTotal = valorTotal;
		this.fechaFinal = fechaFinal;
		this.payroll = payroll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
    
}
