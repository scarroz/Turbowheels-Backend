package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.EPSDTO;
import co.edu.unbosque.nominabackend.mapper.EPSMapper;
import co.edu.unbosque.nominabackend.repository.EPSRepository;

@Service
public class EPSService {

    private final EPSRepository repository;

    public EPSService(EPSRepository repository) {
        this.repository = repository;
    }

    public void crearEPS(String nombre) {
        repository.createEPS(nombre);
    }

    public List<EPSDTO> listarEPS() {
        return repository.listAll().stream()
                .map(EPSMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<EPSDTO> obtenerEPS(Long id) {
        return repository.buscarPorId(id)
                         .map(EPSMapper::toDTO);
    }

    public void eliminarEPS(Long id) {
        repository.deleteEPS(id);
    }
    public List<AuditoriaDTO> listar(){
    	return repository.lst();
    }
}
