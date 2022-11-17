
package modelo;

//CLASE

public class Usuario {
    private int id;
    private String correoElectronico;
    private String nombreDeUsuario;
    private String contraseña;

    public Usuario(int id, String correoElectronico, String nombreDeUsuario, String contraseña) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
