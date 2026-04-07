package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.CesantiaDTO;
import co.edu.unbosque.nominabackend.model.Cesantia;

public class CesantiaMapper {

	public static CesantiaDTO toDTO(Cesantia c) {
		if (c == null)
			return null;
		CesantiaDTO dto = new CesantiaDTO();
		dto.setId(c.getId());
		dto.setValor(c.getValor());
		return dto;
	}
}
