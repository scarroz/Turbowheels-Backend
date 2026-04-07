package co.edu.unbosque.nominabackend.dto;

public class CreateUsuarioDTO {
    private Long documento;
    private String email;
    private String password;
    private int edad;

    public CreateUsuarioDTO() {
    }

    public CreateUsuarioDTO(Long documento, String email, String password, int edad) {
        this.documento = documento;
        this.email = email;
        this.password = password;
        this.edad = edad;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}