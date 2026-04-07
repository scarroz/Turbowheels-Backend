package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Vacation;

public interface VacationRepository extends JpaRepository<Vacation, Long> {

    @Procedure(procedureName = "sp_create_vacation")
    void createVacation(@Param("pn_dias") Integer dias,
                        @Param("pv_disfrute") String disfrute,
                        @Param("pn_payroll_id") Long payrollId);

    @Query(value = "CALL sp_get_auditoriaVacation()", nativeQuery = true)
    List<AuditoriaDTO> lst();
}
