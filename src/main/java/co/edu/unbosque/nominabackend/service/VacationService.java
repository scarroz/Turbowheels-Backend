package co.edu.unbosque.nominabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateVacationDTO;
import co.edu.unbosque.nominabackend.repository.VacationRepository;

@Service
public class VacationService {

	private final VacationRepository repository;

	public VacationService(VacationRepository repository) {
		this.repository = repository;
	}

	public void registrarVacacion(CreateVacationDTO dto) {
		repository.createVacation(dto.getDias(), dto.getDisfrute(), dto.getPayrollId());
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();

	}
}
