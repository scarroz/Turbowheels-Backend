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
import co.edu.unbosque.nominabackend.dto.FinalSettlementDTO;
import co.edu.unbosque.nominabackend.dto.FullFinalSettlementDTO;
import co.edu.unbosque.nominabackend.model.FinalSettlement;
import co.edu.unbosque.nominabackend.service.FinalSettlementService;

@RestController
@RequestMapping("/api/final-settlement")
@CrossOrigin(origins = "*")
public class FinalSettlementController {

	private final FinalSettlementService service;

	public FinalSettlementController(FinalSettlementService service) {
		this.service = service;
	}

	@PostMapping("/{payrollId}")
	public ResponseEntity<Void> registrar(@RequestBody FinalSettlementDTO dto, @PathVariable Long payrollId) {
		service.registrarLiquidacionFinal(dto, payrollId);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping
	public List<FullFinalSettlementDTO> listar() {
		return service.listarLiquidacion();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst() {
		return service.listar();
	}

}
