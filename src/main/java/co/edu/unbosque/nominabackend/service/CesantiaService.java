package co.edu.unbosque.nominabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CesantiaDTO;
import co.edu.unbosque.nominabackend.repository.CesantiaRepository;

@Service
public class CesantiaService {

	private final CesantiaRepository repository;

	public CesantiaService(CesantiaRepository repository) {
		this.repository = repository;
	}

	public void registrarCesantia(CesantiaDTO dto, Long payrollId) {
		repository.createCesantias(dto.getValor(), payrollId);
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();
	}
}
