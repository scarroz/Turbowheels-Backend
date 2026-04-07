package co.edu.unbosque.nominabackend.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "CALL sp_list_employees()", nativeQuery = true)
	List<Employee> listAll();

	@Query(value = "CALL sp_get_employee_by_id(:idIn)", nativeQuery = true)
	Optional<Employee> getById(@Param("idIn") long idIn);

	@Procedure(procedureName = "sp_create_employee")
	void createEmployee(@Param("pv_nombre") String nombre, @Param("pv_apellido") String apellido,
			@Param("pv_documento") String documento, @Param("pv_tipo_documento") String tipoDocumento,
			@Param("pd_fecha_nacimiento") LocalDate fechaNacimiento, @Param("pv_sexo") String sexo,
			@Param("pv_direccion") String direccion, @Param("pv_telefono") String telefono);

	@Procedure(procedureName = "sp_delete_employee")
	void deleteEmployee(@Param("idIn") long idIn);

	@Query(value = "CALL sp_get_employee_by_documento(:idIn)", nativeQuery = true)
	Optional<Employee> getByDocumento(@Param("idIn") long idIn);

	@Query(value = "CALL sp_get_auditoriaEmployee()", nativeQuery = true)
	List<AuditoriaDTO> lst();
}
