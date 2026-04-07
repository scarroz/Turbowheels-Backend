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
@Table(name = "payroll")
public class Payroll {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private Double totalPagado;
	    private LocalDate fecha;

	    // Cada nómina está asociada a un contrato
	    @ManyToOne
	    @JoinColumn(name = "contract_id")
	    private Contract contract;

	    // Componentes de la nómina (relación de uno a muchos)
	    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Deduction> deductions;

	    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Benefit> benefits;

	    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Vacation> vacations;

	    @OneToMany(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Incapacity> incapacities;

	    // Relaciones 1:1
	    @OneToOne(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private Cesantia cesantia;

	    @OneToOne(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private SocialSecurity socialSecurity;

	    @OneToOne(mappedBy = "payroll", cascade = CascadeType.ALL, orphanRemoval = true)
	    private FinalSettlement finalSettlement;
	    
	    public Payroll() {
			// TODO Auto-generated constructor stub
		}

		public Payroll(Double totalPagado, LocalDate fecha, Contract contract, List<Deduction> deductions,
				List<Benefit> benefits, List<Vacation> vacations, List<Incapacity> incapacities, Cesantia cesantia,
				SocialSecurity socialSecurity, FinalSettlement finalSettlement) {
			super();
			this.totalPagado = totalPagado;
			this.fecha = fecha;
			this.contract = contract;
			this.deductions = deductions;
			this.benefits = benefits;
			this.vacations = vacations;
			this.incapacities = incapacities;
			this.cesantia = cesantia;
			this.socialSecurity = socialSecurity;
			this.finalSettlement = finalSettlement;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getTotalPagado() {
			return totalPagado;
		}

		public void setTotalPagado(Double totalPagado) {
			this.totalPagado = totalPagado;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public Contract getContract() {
			return contract;
		}

		public void setContract(Contract contract) {
			this.contract = contract;
		}

		public List<Deduction> getDeductions() {
			return deductions;
		}

		public void setDeductions(List<Deduction> deductions) {
			this.deductions = deductions;
		}

		public List<Benefit> getBenefits() {
			return benefits;
		}

		public void setBenefits(List<Benefit> benefits) {
			this.benefits = benefits;
		}

		public List<Vacation> getVacations() {
			return vacations;
		}

		public void setVacations(List<Vacation> vacations) {
			this.vacations = vacations;
		}

		public List<Incapacity> getIncapacities() {
			return incapacities;
		}

		public void setIncapacities(List<Incapacity> incapacities) {
			this.incapacities = incapacities;
		}

		public Cesantia getCesantia() {
			return cesantia;
		}

		public void setCesantia(Cesantia cesantia) {
			this.cesantia = cesantia;
		}

		public SocialSecurity getSocialSecurity() {
			return socialSecurity;
		}

		public void setSocialSecurity(SocialSecurity socialSecurity) {
			this.socialSecurity = socialSecurity;
		}

		public FinalSettlement getFinalSettlement() {
			return finalSettlement;
		}

		public void setFinalSettlement(FinalSettlement finalSettlement) {
			this.finalSettlement = finalSettlement;
		}
	    
}
