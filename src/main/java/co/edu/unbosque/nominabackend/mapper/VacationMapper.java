package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.VacationDTO;
import co.edu.unbosque.nominabackend.model.Vacation;

public class VacationMapper {

	
	public static VacationDTO toDTO(Vacation v) {
        VacationDTO dto = new VacationDTO();
        dto.setId(v.getId());
        dto.setDias(v.getDias());
        dto.setDisfrute(v.getDisfrute());
        return dto;
    }
}
