package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.FinalSettlement;

public interface FinalSettlementRepository extends JpaRepository<FinalSettlement, Long> {

	@Procedure(procedureName = "sp_create_final_settlement")
	void createFinalSettlement(@Param("pd_fecha_final") String fechaFinal, @Param("pn_payroll_id") Long payrollId);

	@Query(value = "CALL sp_list_settlement", nativeQuery = true)
	List<FinalSettlement> listAll();

	@Query(value = "CALL sp_get_auditoriaFinal_settlement()", nativeQuery = true)
	List<AuditoriaDTO> lst();
}
