package co.edu.unbosque.nominabackend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.EPSDTO;
import co.edu.unbosque.nominabackend.service.EPSService;

@RestController
@RequestMapping("/api/eps")
@CrossOrigin(origins = "*")
public class EPSController {

	private final EPSService service;

	public EPSController(EPSService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> crear(@RequestParam String nombre) {
		service.crearEPS(nombre);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping
	public List<EPSDTO> listar() {
		return service.listarEPS();
	}

	@GetMapping("/{id}")
	public ResponseEntity<EPSDTO> obtener(@PathVariable Long id) {
		return service.obtenerEPS(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		service.eliminarEPS(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst() {
		return service.listar();

	}
}
