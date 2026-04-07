package co.edu.unbosque.nominabackend.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class  FullPayrollDTO {
    private Long id;
    private Double totalPagado;
    private LocalDate fecha;
    private ContractDTO contrato;

    private List<DeductionDTO> deducciones;
    private List<BenefitDTO> prestaciones;
    private List<VacationDTO> vacaciones;
    private List<IncapacityDTO> incapacidades;

    private CesantiaDTO cesantias;
    private SocialSecurityDTO seguridadSocial;
    private FinalSettlementDTO liquidacionFinal;
    
    public FullPayrollDTO() {
		// TODO Auto-generated constructor stub
	}

	public FullPayrollDTO(Long id, Double totalPagado, LocalDate fecha, ContractDTO contrato,
			List<DeductionDTO> deducciones, List<BenefitDTO> prestaciones, List<VacationDTO> vacaciones,
			List<IncapacityDTO> incapacidades, CesantiaDTO cesantias, SocialSecurityDTO seguridadSocial,
			FinalSettlementDTO liquidacionFinal) {
		super();
		this.id = id;
		this.totalPagado = totalPagado;
		this.fecha = fecha;
		this.contrato = contrato;
		this.deducciones = deducciones;
		this.prestaciones = prestaciones;
		this.vacaciones = vacaciones;
		this.incapacidades = incapacidades;
		this.cesantias = cesantias;
		this.seguridadSocial = seguridadSocial;
		this.liquidacionFinal = liquidacionFinal;
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

	public ContractDTO getContrato() {
		return contrato;
	}

	public void setContrato(ContractDTO contrato) {
		this.contrato = contrato;
	}

	public List<DeductionDTO> getDeducciones() {
		return deducciones;
	}

	public void setDeducciones(List<DeductionDTO> deducciones) {
		this.deducciones = deducciones;
	}

	public List<BenefitDTO> getPrestaciones() {
		return prestaciones;
	}

	public void setPrestaciones(List<BenefitDTO> prestaciones) {
		this.prestaciones = prestaciones;
	}

	public List<VacationDTO> getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(List<VacationDTO> vacaciones) {
		this.vacaciones = vacaciones;
	}

	public List<IncapacityDTO> getIncapacidades() {
		return incapacidades;
	}

	public void setIncapacidades(List<IncapacityDTO> incapacidades) {
		this.incapacidades = incapacidades;
	}

	public CesantiaDTO getCesantias() {
		return cesantias;
	}

	public void setCesantias(CesantiaDTO cesantias) {
		this.cesantias = cesantias;
	}

	public SocialSecurityDTO getSeguridadSocial() {
		return seguridadSocial;
	}

	public void setSeguridadSocial(SocialSecurityDTO seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	public FinalSettlementDTO getLiquidacionFinal() {
		return liquidacionFinal;
	}

	public void setLiquidacionFinal(FinalSettlementDTO liquidacionFinal) {
		this.liquidacionFinal = liquidacionFinal;
	}
    
    
}
