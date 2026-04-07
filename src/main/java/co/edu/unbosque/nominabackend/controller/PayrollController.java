package co.edu.unbosque.nominabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreatePayrollDTO;
import co.edu.unbosque.nominabackend.dto.PayrollDTO;
import co.edu.unbosque.nominabackend.service.PayrollService;

@RestController
@RequestMapping("/api/payrolls")
@CrossOrigin(origins = "*")
public class PayrollController {

	private final PayrollService service;

	public PayrollController(PayrollService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> calcular(@RequestBody CreatePayrollDTO dto) {
		service.calcularNomina(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/calcularnominatotal")
	public Double calcularNominaTotal() {
		return service.calcularNominaTotal();

	}

	@GetMapping
	public List<PayrollDTO> listar() {
		return service.listarNominas();
	}

	@GetMapping("/{id}")
	public ResponseEntity<PayrollDTO> obtener(@PathVariable Long id) {
		return service.obtenerNomina(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		service.eliminarNomina(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/total")
	public Long contarNominasGeneradas() {
	    return (long) service.listarNominas().size();
	}
	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst(){
		return service.listar();
	}
}
