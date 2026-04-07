package co.edu.unbosque.nominabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateIncapacityDTO;
import co.edu.unbosque.nominabackend.repository.IncapacityRepository;

@Service
public class IncapacityService {

	private final IncapacityRepository repository;

	public IncapacityService(IncapacityRepository repository) {
		this.repository = repository;
	}

	public void registrarIncapacidad(CreateIncapacityDTO dto) {
		repository.createIncapacity(dto.getTipo(), dto.getDias(), dto.getValorPagado(), dto.getEpsId(),
				dto.getPayrollId());
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();

	}
}
