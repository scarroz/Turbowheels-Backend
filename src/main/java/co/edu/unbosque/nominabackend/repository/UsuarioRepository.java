package co.edu.unbosque.nominabackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.nominabackend.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    List<Usuario> findByNombre(String nombre);
    Optional<Usuario> findByEmailAndPass(String email, String pass);


}