package co.edu.unbosque.nominabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateBenefitDTO;
import co.edu.unbosque.nominabackend.repository.BenefitRepository;

@Service
public class BenefitService {

	private final BenefitRepository repository;

	public BenefitService(BenefitRepository repository) {
		this.repository = repository;
	}

	public void crearPrestacion(CreateBenefitDTO dto) {
		repository.createBenefit(dto.getTipo(), dto.getValor(), dto.getPayrollId());
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();
	}
	
}
