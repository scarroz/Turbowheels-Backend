package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Cesantia;

public interface CesantiaRepository extends JpaRepository<Cesantia, Long> {

    @Procedure(procedureName = "sp_create_cesantia")
    void createCesantias(@Param("pn_valor") Double valor,
                         @Param("pn_payroll_id") Long payrollId);
    
    @Query(value = "CALL sp_get_auditoriaCesantia()", nativeQuery = true)
    List<AuditoriaDTO> lst();
}
