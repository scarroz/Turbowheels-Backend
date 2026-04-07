package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.SocialSecurity;

public interface SocialSecurityRepository extends JpaRepository<SocialSecurity, Long> {

    @Procedure(procedureName = "sp_create_social_security")
    void createSocialSecurity(@Param("pn_pension") Double pension,
                              @Param("pn_salud") Double salud,
                              @Param("pn_arl") Double arl,
                              @Param("pn_payroll_id") Long payrollId);
    @Query(value = "CALL sp_get_auditoriaSocial_security()", nativeQuery = true)
    List<AuditoriaDTO> lst();
}
