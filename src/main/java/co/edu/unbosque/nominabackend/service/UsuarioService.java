package co.edu.unbosque.nominabackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.nominabackend.dto.CreateUsuarioDTO;
import co.edu.unbosque.nominabackend.model.Employee;
import co.edu.unbosque.nominabackend.model.Usuario;
import co.edu.unbosque.nominabackend.repository.EmployeeRepository;
import co.edu.unbosque.nominabackend.repository.UsuarioRepository;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmailService eService;
    public UsuarioService() {
        // TODO Auto-generated constructor stub
    }

    

    public Usuario crearUsuarioDesdeEmployee(CreateUsuarioDTO dto) {
        Optional<Employee> empleado = employeeRepository.getByDocumento(dto.getDocumento());
        if (!empleado.isPresent()) {
            System.out.println("Empleado no encontrado");
        }
        else {
            Usuario usuario = new Usuario();
            usuario.setNombre(empleado.get().getNombre());
            usuario.setApellido(empleado.get().getApellido());
            usuario.setDocumento(empleado.get().getDocumento());
            usuario.setEmail(dto.getEmail());
            usuario.setPassword(dto.getPassword());
            usuario.setEdad(dto.getEdad());
            eService.sendWelcomeEmail(usuario.getEmail());
            return usuarioRepo.save(usuario);
        }
        return null;
         
    }
     public Optional<Usuario> login(String email, String password) {
            return usuarioRepo.findByEmailAndPass(email, password);
        }
    public UsuarioService(UsuarioRepository usuarioRepo) {
        super();
        this.usuarioRepo = usuarioRepo;
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepo.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public UsuarioRepository getUsuarioRepo() {
        return usuarioRepo;
    }

    public void setUsuarioRepo(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
}