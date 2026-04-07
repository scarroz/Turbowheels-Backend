package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateEmployeeDTO;
import co.edu.unbosque.nominabackend.dto.EmployeeDTO;
import co.edu.unbosque.nominabackend.mapper.EmployeeMapper;
import co.edu.unbosque.nominabackend.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public void crearEmpleado(EmployeeDTO dto) {
		repository.createEmployee(dto.getNombre(), dto.getApellido(), dto.getDocumento(), dto.getTipoDocumento(),
				dto.getFechaNacimiento(), dto.getSexo(), dto.getDireccion(), dto.getTelefono());
	}

	public List<EmployeeDTO> listarEmpleados() {
		return repository.listAll().stream().map(EmployeeMapper::toDTO).collect(Collectors.toList());
	}

	public Optional<EmployeeDTO> obtenerEmpleado(long id) {
		return repository.getById(id).map(EmployeeMapper::toDTO);
	}

	public void eliminarEmpleado(long id) {
		repository.deleteEmployee(id);
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();
	}
}
