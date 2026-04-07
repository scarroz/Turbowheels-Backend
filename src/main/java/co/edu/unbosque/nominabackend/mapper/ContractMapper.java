package co.edu.unbosque.nominabackend.mapper;

import java.util.stream.Collectors;

import co.edu.unbosque.nominabackend.dto.ContractDTO;
import co.edu.unbosque.nominabackend.dto.CreateContractDTO;
import co.edu.unbosque.nominabackend.dto.FullContractDTO;
import co.edu.unbosque.nominabackend.model.Contract;

public class ContractMapper {

	   public static Contract toEntity(CreateContractDTO dto) {
	        Contract c = new Contract();
	        c.setTipo(dto.getTipo());
	        c.setFechaInicio(dto.getFechaInicio());
	        c.setFechaFin(dto.getFechaFin());
	        c.setSalario(dto.getSalario());
	        return c;
	    }

	   public static ContractDTO toDTO(Contract c) {
		    ContractDTO dto = new ContractDTO();
		    dto.setId(c.getId());
		    dto.setTipo(c.getTipo());
		    dto.setFechaInicio(c.getFechaInicio());
		    dto.setFechaFin(c.getFechaFin());
		    dto.setSalario(c.getSalario());

		    if (c.getEmployee() != null) {
		        dto.setEmployeeId(c.getEmployee().getId());
		    } else {
		        dto.setEmployeeId(null); // o lanza excepción si es obligatorio
		    }

		    return dto;
		}

	    public static FullContractDTO toFullDTO(Contract c) {
	        FullContractDTO dto = new FullContractDTO();
	        dto.setId(c.getId());
	        dto.setTipo(c.getTipo());
	        dto.setFechaInicio(c.getFechaInicio());
	        dto.setFechaFin(c.getFechaFin());
	        dto.setSalario(c.getSalario());
	        dto.setEmpleado(EmployeeMapper.toDTO(c.getEmployee()));
	        if (c.getPayrolls() != null) {
	            dto.setNominas(c.getPayrolls().stream()
	                    .map(PayrollMapper::toDTO)
	                    .collect(Collectors.toList()));
	        }
	        return dto;
	    }
}
