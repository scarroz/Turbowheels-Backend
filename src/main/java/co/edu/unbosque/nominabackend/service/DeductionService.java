package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateDeductionDTO;
import co.edu.unbosque.nominabackend.dto.DeductionDTO;
import co.edu.unbosque.nominabackend.mapper.DeductionMapper;
import co.edu.unbosque.nominabackend.repository.DeductionRepository;

@Service
public class DeductionService {

	private final DeductionRepository repository;

	public DeductionService(DeductionRepository repository) {
		this.repository = repository;
	}

	public void crearDeduccion(CreateDeductionDTO dto) {

		repository.createDeduction(dto.getTipo(), dto.getValor(), dto.getPayrollId());
	}

	public List<DeductionDTO> listarDeducciones() {
		return repository.listAll().stream().map(DeductionMapper::toDTO).collect(Collectors.toList());
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();
	}
}
