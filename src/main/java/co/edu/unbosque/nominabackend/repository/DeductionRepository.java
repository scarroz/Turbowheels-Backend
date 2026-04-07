package co.edu.unbosque.nominabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Deduction;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeductionRepository extends JpaRepository<Deduction, Long> {

	@Query(value = "CALL sp_list_deductions()", nativeQuery = true)
	List<Deduction> listAll();

	@Procedure(procedureName = "sp_create_deduction")
	void createDeduction(@Param("pv_tipo") String tipo, @Param("pn_valor") Double valor,
			@Param("pn_payroll_id") Long payrollId);

	@Query(value = "CALL sp_get_auditoriaDeduction()", nativeQuery = true)
	List<AuditoriaDTO> lst();
}
