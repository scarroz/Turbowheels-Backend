package co.edu.unbosque.nominabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreateBenefitDTO;
import co.edu.unbosque.nominabackend.service.BenefitService;

@RestController
@RequestMapping("/api/benefits")
@CrossOrigin(origins = "*")
public class BenefitController {

	private final BenefitService service;

	public BenefitController(BenefitService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody CreateBenefitDTO dto) {
		service.crearPrestacion(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst() {
		return service.listar();
	}
}
