package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.model.Carro;
import co.edu.unbosque.nominabackend.repository.CarroRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CarroService {

	@Autowired
	private CarroRepository carroRepo;
	
	public List<Carro> lst(){
		return carroRepo.listaProcedure();
		
	}
	
	public Optional<Carro> getById(long id){
		return carroRepo.getById(id);
		
	}
	 public void guardarCarro(String marca, String modelo, int year, float km) {
	        carroRepo.saveProcedure(marca, modelo, year, km);
	    }
	
	 public float mediaKm() {
		 
		 return carroRepo.mediaKm();
	 }
	 public void deleteByIdProcedure(long id) {
		 carroRepo.deleteByIdProcedure(id);
	 }

	public CarroRepository getCarroRepo() {
		return carroRepo;
	}

	public void setCarroRepo(CarroRepository carroRepo) {
		this.carroRepo = carroRepo;
	}
	
}
