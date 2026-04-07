package co.edu.unbosque.nominabackend.mapper;

import java.util.stream.Collectors;

import co.edu.unbosque.nominabackend.dto.FullPayrollDTO;
import co.edu.unbosque.nominabackend.dto.PayrollDTO;
import co.edu.unbosque.nominabackend.model.Payroll;

public class PayrollMapper {

	public static PayrollDTO toDTO(Payroll p) {
		PayrollDTO dto = new PayrollDTO();
		dto.setId(p.getId());
		dto.setFecha(p.getFecha());
		dto.setTotalPagado(p.getTotalPagado());
		dto.setContractId(p.getContract().getId());
		return dto;
	}

	public static FullPayrollDTO toFullDTO(Payroll p) {
		FullPayrollDTO dto = new FullPayrollDTO();
		dto.setId(p.getId());
		dto.setFecha(p.getFecha());
		dto.setTotalPagado(p.getTotalPagado());
		dto.setContrato(ContractMapper.toDTO(p.getContract()));

		dto.setDeducciones(p.getDeductions().stream().map(DeductionMapper::toDTO).collect(Collectors.toList()));
		dto.setPrestaciones(p.getBenefits().stream().map(BenefitMapper::toDTO).collect(Collectors.toList()));
		dto.setVacaciones(p.getVacations().stream().map(VacationMapper::toDTO).collect(Collectors.toList()));
		dto.setIncapacidades(p.getIncapacities().stream().map(IncapacityMapper::toDTO).collect(Collectors.toList()));
		dto.setCesantias(CesantiaMapper.toDTO(p.getCesantia()));
		dto.setSeguridadSocial(SocialSecurityMapper.toDTO(p.getSocialSecurity()));
		return dto;
	}
}