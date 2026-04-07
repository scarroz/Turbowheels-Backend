package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.IncapacityDTO;
import co.edu.unbosque.nominabackend.model.Incapacity;

public class IncapacityMapper {

	public static IncapacityDTO toDTO(Incapacity i) {
		IncapacityDTO dto = new IncapacityDTO();
		dto.setId(i.getId());
		dto.setTipo(i.getTipo());
		dto.setDias(i.getDias());
		dto.setValorPagado(i.getValorPagado());
		dto.setNombreEps(i.getEps().getNombre());
		return dto;
	}
}
