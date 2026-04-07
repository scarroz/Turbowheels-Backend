package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.ContractDTO;
import co.edu.unbosque.nominabackend.dto.CreateContractDTO;
import co.edu.unbosque.nominabackend.mapper.ContractMapper;
import co.edu.unbosque.nominabackend.repository.ContractRepository;

@Service
public class ContractService {

	private final ContractRepository repository;

	public ContractService(ContractRepository repository) {
		this.repository = repository;
	}

	public void crearContrato(CreateContractDTO dto) {
		repository.createContract(dto.getTipo(), dto.getFechaInicio().toString(), dto.getFechaFin().toString(),
				dto.getSalario(), dto.getEmployeeId());
	}

	public void actualizarContratoPorEmpleadoId(int empleadoId, String tipoContrato, String fechaInicio,
			String fechaFin, double salario) {
		repository.updateContractByEmployeeId(empleadoId, tipoContrato, fechaInicio, fechaFin, salario);
	}

	public List<ContractDTO> listarContratos() {
		return repository.listAll().stream().map(ContractMapper::toDTO).collect(Collectors.toList());
	}

	public Optional<ContractDTO> obtenerContrato(long id) {
		return repository.getById(id).map(ContractMapper::toDTO);
	}

	public void eliminarContrato(long id) {
		repository.deleteContract(id);
	}
	public List<AuditoriaDTO> listar(){
		return repository.lst();
	}
}
