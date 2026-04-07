package co.edu.unbosque.nominabackend.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.nominabackend.dto.CreateUsuarioDTO;
import co.edu.unbosque.nominabackend.model.Usuario;
import co.edu.unbosque.nominabackend.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.obtenerTodos();
    }

    @PostMapping
    public ResponseEntity<Usuario> crear(@RequestBody CreateUsuarioDTO dto) {
        Usuario creado = service.crearUsuarioDesdeEmployee(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email,@RequestParam String  pass) {
        Optional<Usuario> foundUser = service.login(email, pass);

        if (foundUser.isPresent()) {
            return ResponseEntity.ok(foundUser.get());
        } else {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }
    }
}