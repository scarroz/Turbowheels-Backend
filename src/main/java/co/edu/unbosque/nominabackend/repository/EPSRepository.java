package co.edu.unbosque.nominabackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.dto.AuditoriaDTO;
import co.edu.unbosque.nominabackend.model.EPS;

public interface EPSRepository extends JpaRepository<EPS, Long> {

	@Query(value = "CALL sp_list_eps()", nativeQuery = true)
	List<EPS> listAll();

	@Query(value = "CALL sp_get_eps_by_id(:idIn)", nativeQuery = true)
	Optional<EPS> buscarPorId(@Param("idIn") long idIn);

	@Procedure(procedureName = "sp_create_eps")
	void createEPS(@Param("pv_nombre") String nombre);

	@Procedure(procedureName = "sp_delete_eps_by_id")
	void deleteEPS(@Param("idIn") long idIn);
	
	@Query(value = "CALL sp_get_auditoriaEps()", nativeQuery = true)
	List<AuditoriaDTO> lst();
	
}