package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Benefit;

public interface BenefitRepository extends JpaRepository<Benefit, Long> {

    @Procedure(procedureName = "sp_create_benefit")
    void createBenefit(@Param("pv_tipo") String tipo,
                       @Param("pn_valor") Double valor,
                       @Param("pn_payroll_id") Long payrollId);
    @Query(value = "CALL sp_get_auditoriaBenefit()", nativeQuery = true)
    List<AuditoriaDTO> lst();
}
