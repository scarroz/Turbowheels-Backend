package co.edu.unbosque.nominabackend.mapper;

import co.edu.unbosque.nominabackend.dto.SocialSecurityDTO;
import co.edu.unbosque.nominabackend.model.SocialSecurity;

public class SocialSecurityMapper {

	public static SocialSecurityDTO toDTO(SocialSecurity s) {
		if (s == null)
			return null;
		SocialSecurityDTO dto = new SocialSecurityDTO();
		dto.setId(s.getId());
		dto.setPension(s.getPension());
		dto.setSalud(s.getSalud());
		dto.setArl(s.getArl());
		return dto;
	}
}
