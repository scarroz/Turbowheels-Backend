package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.dto.CreatePayrollDTO;
import co.edu.unbosque.nominabackend.dto.PayrollDTO;
import co.edu.unbosque.nominabackend.mapper.PayrollMapper;
import co.edu.unbosque.nominabackend.repository.PayrollRepository;

@Service
public class PayrollService {

	private final PayrollRepository repository;

	public PayrollService(PayrollRepository repository) {
		this.repository = repository;
	}

	public void calcularNomina(CreatePayrollDTO dto) {
		repository.calculatePayroll(dto.getContractId());
	}

	public Double calcularNominaTotal() {
		return repository.getTotalPayroll();
	}

	public List<PayrollDTO> listarNominas() {
		return repository.listAll().stream().map(PayrollMapper::toDTO).collect(Collectors.toList());
	}

	public Optional<PayrollDTO> obtenerNomina(long id) {
		return repository.getById(id).map(PayrollMapper::toDTO);
	}

	public void eliminarNomina(long id) {
		repository.deletePayroll(id);
	}

	public List<AuditoriaDTO> listar() {
		return repository.lst();

	}
}
