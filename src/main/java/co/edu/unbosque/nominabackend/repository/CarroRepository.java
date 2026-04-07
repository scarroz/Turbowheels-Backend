package co.edu.unbosque.nominabackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.nominabackend.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
//Get all
	@Query(value = "CALL sp_lista()", nativeQuery = true)
	List<Carro> listaProcedure();
//GetById
	@Query(value = "CALL sp_getById(:idIn)", nativeQuery = true)
	Optional<Carro> getById(@Param("idIn") long idIn);
//Create
	@Procedure(procedureName = "sp_saveCarro")
	void saveProcedure(@Param("pv_marca") String pv_marca,
	                   @Param("pv_modelo") String pv_modelo,
	                   @Param("pn_year") int pn_year,
	                   @Param("pn_km") float pn_km);
//Media de kilometros
	@Query(value = "CALL sp_mediaKm", nativeQuery = true)
	float mediaKm();
//Delete
	@Procedure(procedureName = "sp_deleteByIdProcedure")
	void deleteByIdProcedure(@Param("idIn") long idIn);}
