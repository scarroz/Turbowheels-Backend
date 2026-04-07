package co.edu.unbosque.nominabackend.mapper;

import java.util.stream.Collectors;

import co.edu.unbosque.nominabackend.dto.CreateEmployeeDTO;
import co.edu.unbosque.nominabackend.dto.EmployeeDTO;
import co.edu.unbosque.nominabackend.dto.FullEmployeeDTO;
import co.edu.unbosque.nominabackend.model.Employee;

public class EmployeeMapper {
	public static Employee toEntity(EmployeeDTO dto) {
		Employee emp = new Employee();
		emp.setNombre(dto.getNombre());
		emp.setApellido(dto.getApellido());
		emp.setDocumento(dto.getDocumento());
		return emp;
	}

	public static EmployeeDTO toDTO(Employee emp) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(emp.getId());
		dto.setNombre(emp.getNombre());
		dto.setApellido(emp.getApellido());
		dto.setDocumento(emp.getDocumento());
		dto.setTipoDocumento(emp.getTipoDocumento());
		dto.setFechaNacimiento(emp.getFechaNacimiento());
		dto.setSexo(emp.getSexo());
		dto.setDireccion(emp.getDireccion());
		dto.setTelefono(emp.getTelefono());

		return dto;
	}

}
