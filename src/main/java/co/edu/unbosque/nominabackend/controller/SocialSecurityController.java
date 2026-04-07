package co.edu.unbosque.nominabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.SocialSecurityDTO;
import co.edu.unbosque.nominabackend.service.SocialSecurityService;

@RestController
@RequestMapping("/api/social-security")
@CrossOrigin(origins = "*")
public class SocialSecurityController {

	private final SocialSecurityService service;

	public SocialSecurityController(SocialSecurityService service) {
		this.service = service;
	}

	@PostMapping("/{payrollId}")
	public ResponseEntity<Void> registrar(@RequestBody SocialSecurityDTO dto, @PathVariable Long payrollId) {
		service.registrarSeguridadSocial(dto, payrollId);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst(){
		return service.listar();
	}
}
