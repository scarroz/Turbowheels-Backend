package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.BenefitDTO;
import co.edu.unbosque.nominabackend.model.Benefit;

public class BenefitMapper {

	
	 public static BenefitDTO toDTO(Benefit b) {
	        BenefitDTO dto = new BenefitDTO();
	        dto.setId(b.getId());
	        dto.setTipo(b.getTipo());
	        dto.setValor(b.getValor());
	        return dto;
	    }
}
