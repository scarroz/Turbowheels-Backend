package co.edu.unbosque.nominabackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import co.edu.unbosque.nominabackend.model.Carro;
import co.edu.unbosque.nominabackend.service.CarroService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/carro")
@CrossOrigin(origins = "*")
public class CarroController {

	@Autowired
	private CarroService carroService;

	public CarroService getCarroService() {
		return carroService;
	}

	@GetMapping("/list")
	public ResponseEntity<List<Carro>> lst() {
		List<Carro> lst = carroService.lst();
		return new ResponseEntity<>(lst, HttpStatus.OK);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Carro> findById(@PathVariable("id") long id) {
		Optional<Carro> carro = carroService.getById(id);
		return new ResponseEntity(carro, HttpStatus.OK);

	}

	@PostMapping("/crear")
	public ResponseEntity<String> guardarCarro(@RequestParam String marca, @RequestParam String modelo,
			@RequestParam int year, @RequestParam float km) {
		carroService.guardarCarro(marca, modelo, year, km);
		return ResponseEntity.ok("Carro guardado exitosamente.");
	}

	@GetMapping("/mediaKm")
	public ResponseEntity<Float> mediaKm(){
		float media = carroService.mediaKm();
		return new ResponseEntity<>(media, HttpStatus.OK);
	}
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<?> deleteByIdProcedure(@PathVariable("id") long id){
		carroService.deleteByIdProcedure(id);
		return new ResponseEntity("Carro eliminado con exito", HttpStatus.OK);
	}
	
	public void setCarroService(CarroService carroService) {
		this.carroService = carroService;
	}

}
