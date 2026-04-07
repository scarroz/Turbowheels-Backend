package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.DeductionDTO;
import co.edu.unbosque.nominabackend.model.Deduction;

public class DeductionMapper {
	public static DeductionDTO toDTO(Deduction d) {
		DeductionDTO dto = new DeductionDTO();
		dto.setId(d.getId());
		dto.setTipo(d.getTipo());
		dto.setValor(d.getValor());
		return dto;
	}
}
