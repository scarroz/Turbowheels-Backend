package co.edu.unbosque.nominabackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Incapacity;

public interface IncapacityRepository extends JpaRepository<Incapacity, Long> {

    @Procedure(procedureName = "sp_create_incapacity")
    void createIncapacity(@Param("pv_tipo") String tipo,
                          @Param("pn_dias") Integer dias,
                          @Param("pn_valor_pagado") Double valorPagado,
                          @Param("pn_eps_id") Long epsId,
                          @Param("pn_payroll_id") Long payrollId);
    
    @Query(value = "CALL sp_get_auditoriaIncapacity()", nativeQuery =  true)
    List<AuditoriaDTO> lst();
}
