package co.edu.unbosque.nominabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Payroll;

import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {

	@Query(value = "CALL sp_list_payrolls()", nativeQuery = true)
	List<Payroll> listAll();

	@Query(value = "CALL sp_get_payroll_by_id(:idIn)", nativeQuery = true)
	Optional<Payroll> getById(@Param("idIn") long idIn);

	@Procedure(procedureName = "sp_calculate_payroll")
	void calculatePayroll(@Param("pn_contract_id") Long contractId);

	@Procedure(procedureName = "sp_delete_payroll")
	void deletePayroll(@Param("idIn") long idIn);

	@Query(value = "SELECT fn_totalPayroll()", nativeQuery = true)
	Double getTotalPayroll();

	@Query(value = "CALL sp_get_auditoriaPayroll()", nativeQuery = true)
	List<AuditoriaDTO> lst();
}
