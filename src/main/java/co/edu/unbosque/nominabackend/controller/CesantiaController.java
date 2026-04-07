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
import co.edu.unbosque.nominabackend.dto.CesantiaDTO;
import co.edu.unbosque.nominabackend.service.CesantiaService;

@RestController
@RequestMapping("/api/cesantia")
@CrossOrigin(origins = "*")
public class CesantiaController {

	private final CesantiaService service;

	public CesantiaController(CesantiaService service) {
		this.service = service;
	}

	@PostMapping("/{payrollId}")
	public ResponseEntity<Void> registrar(@RequestBody CesantiaDTO dto, @PathVariable Long payrollId) {
		service.registrarCesantia(dto, payrollId);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst() {
		return service.listar();
	}
}
