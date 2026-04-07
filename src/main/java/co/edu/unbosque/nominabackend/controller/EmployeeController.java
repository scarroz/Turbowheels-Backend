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
import co.edu.unbosque.nominabackend.dto.CreateEmployeeDTO;
import co.edu.unbosque.nominabackend.dto.EmployeeDTO;
import co.edu.unbosque.nominabackend.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody EmployeeDTO dto) {
		service.crearEmpleado(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping
	public List<EmployeeDTO> listar() {
		return service.listarEmpleados();
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> obtener(@PathVariable Long id) {
		return service.obtenerEmpleado(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		service.eliminarEmpleado(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/total")
	public Long contarEmpleados() {
		return (long) service.listarEmpleados().size();
	}

	@GetMapping("/triggers")
	public List<AuditoriaDTO> lst() {
		return service.listar();
	}

}
