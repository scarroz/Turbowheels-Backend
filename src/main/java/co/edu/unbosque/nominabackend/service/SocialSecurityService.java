package co.edu.unbosque.nominabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.SocialSecurityDTO;
import co.edu.unbosque.nominabackend.repository.SocialSecurityRepository;

@Service
public class SocialSecurityService {

	private final SocialSecurityRepository repository;

	public SocialSecurityService(SocialSecurityRepository repository) {
		this.repository = repository;
	}

	public void registrarSeguridadSocial(SocialSecurityDTO dto, Long payrollId) {
		repository.createSocialSecurity(dto.getPension(), dto.getSalud(), dto.getArl(), payrollId);
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();

	}
}
