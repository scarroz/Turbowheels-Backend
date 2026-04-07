package co.edu.unbosque.nominabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Contract;

import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ContractRepository extends JpaRepository<Contract, Long> {

    @Query(value = "CALL sp_list_contracts()", nativeQuery = true)
    List<Contract> listAll();

    @Query(value = "CALL sp_get_contract_by_id(:idIn)", nativeQuery = true)
    Optional<Contract> getById(@Param("idIn") long idIn);

    @Procedure(procedureName = "sp_create_contract")
    void createContract(@Param("pv_tipo") String tipo,
                        @Param("pd_fecha_inicio") String fechaInicio,
                        @Param("pd_fecha_fin") String fechaFin,
                        @Param("pn_salario") Double salario,
                        @Param("pn_employee_id") Long employeeId);

    @Procedure(procedureName = "sp_delete_contract")
    void deleteContract(@Param("idIn") long idIn);


	@Procedure(procedureName = "sp_update_contract_by_employee_id")
	void updateContractByEmployeeId(
	        @Param("idIn")
	        int idEmpleado,
	        @Param("p_tipo_contrato") String p_tipo_contrato,
	        @Param("p_fecha_inicio") String p_fecha_inicio, @Param("p_fecha_fin") String p_fecha_fin,
	        @Param("p_salario") double p_salario);
	
	@Query(value = "CALL sp_get_auditoriaContract()", nativeQuery = true)
	List<AuditoriaDTO> lst();
}