package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.FinalSettlementDTO;
import co.edu.unbosque.nominabackend.dto.FullFinalSettlementDTO;
import co.edu.unbosque.nominabackend.model.FinalSettlement;

public class FinalSettlementMapper {

	public static FullFinalSettlementDTO toDTO(FinalSettlement f) {
		if (f == null)
			return null;
		FullFinalSettlementDTO dto = new FullFinalSettlementDTO();
		dto.setId(f.getId());
		dto.setFechaFinal(f.getFechaFinal());
		dto.setValorPagado(f.getValorTotal());
		return dto;
	}
}
