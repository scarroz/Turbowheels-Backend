package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.FinalSettlementDTO;
import co.edu.unbosque.nominabackend.dto.FullFinalSettlementDTO;
import co.edu.unbosque.nominabackend.mapper.FinalSettlementMapper;
import co.edu.unbosque.nominabackend.model.FinalSettlement;
import co.edu.unbosque.nominabackend.repository.FinalSettlementRepository;

@Service
public class FinalSettlementService {

	private final FinalSettlementRepository repository;

	public FinalSettlementService(FinalSettlementRepository repository) {
		this.repository = repository;
	}

	public void registrarLiquidacionFinal(FinalSettlementDTO dto, Long payrollId) {
		repository.createFinalSettlement(dto.getFechaFinal().toString(), payrollId);
	}

	public List<FullFinalSettlementDTO> listarLiquidacion() {
		return repository.listAll().stream().map(FinalSettlementMapper::toDTO).collect(Collectors.toList());
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();

	}
}
