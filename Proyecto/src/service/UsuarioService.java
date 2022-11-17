
package service;

import java.util.List;
import modelo.Usuario;

//METODOS DE USUARIO

public interface UsuarioService {
    public void registrar(Usuario us) throws Exception;
    public void modificar(Usuario us) throws Exception;
    public void eliminar(Usuario us) throws Exception;

    
    public List <Usuario> listar() throws Exception;
}
