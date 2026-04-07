package co.edu.unbosque.nominabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.ContractDTO;
import co.edu.unbosque.nominabackend.dto.CreateContractDTO;
import co.edu.unbosque.nominabackend.service.ContractService;

@RestController
@RequestMapping("/api/contracts")
@CrossOrigin(origins = "*")
public class ContractController {

	private final ContractService service;

	public ContractController(ContractService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody CreateContractDTO dto) {
		service.crearContrato(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping
	public List<ContractDTO> listar() {
		return service.listarContratos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ContractDTO> obtener(@PathVariable Long id) {
		return service.obtenerContrato(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		service.eliminarContrato(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/actualizar")
	public void actualizarContrato(@RequestParam int empleadoId, @RequestParam String tipoContrato,
			@RequestParam String fechaInicio, @RequestParam String fechaFin, @RequestParam double salario) {
		service.actualizarContratoPorEmpleadoId(empleadoId, tipoContrato, fechaInicio, fechaFin, salario);
	}
	
	@GetMapping("/total")
	public Long contarNominasGeneradas() {
	    return (long) service.listarContratos().size();
	}
	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst(){
		return service.listar();
	}
}
