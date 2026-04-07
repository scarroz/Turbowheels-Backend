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
import co.edu.unbosque.nominabackend.dto.CreateDeductionDTO;
import co.edu.unbosque.nominabackend.dto.DeductionDTO;
import co.edu.unbosque.nominabackend.service.DeductionService;

@RestController
@RequestMapping("/api/deductions")
@CrossOrigin(origins = "*")
public class DeductionController {

	private final DeductionService service;

	public DeductionController(DeductionService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody CreateDeductionDTO dto) {
		service.crearDeduccion(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping
	public List<DeductionDTO> listar() {
		return service.listarDeducciones();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> listarDTO() {
		return service.listar();
	}
}
