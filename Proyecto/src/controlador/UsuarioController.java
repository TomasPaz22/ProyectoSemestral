
package controlador;

//METODOS DESDE "UsuarioServiceImpl" PARA FUNCIONALIDADES.
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioController {
    private static final String SQL_INSERT  = "INSERT INTO USUARIO VALUES(?,?,?,?)";
    private static final String SQL_UPDATE  = "UPDATE USUARIO SET correo = ?, nombre = ?, contrasena = ? WHERE id = ?";
    private static final String SQL_DELETE  = "DELETE FROM USUARIO WHERE id = ?";
    private static final String SQL_READ    = "SELECT * FROM USUARIO WHERE id = ?";
    private static final String SQL_READALL = "SELECT * FROM USUARIO ORDER BY id";
    
    private PreparedStatement ps;
    private ResultSet rs;
    
    private static final Conexion c = Conexion.obtenerEstadoConexion();
    public boolean create(Usuario u) throws SQLException {
        try 
        {
            ps = c.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, u.getId());
            ps.setString(2, u.getCorreoElectronico()); 
            ps.setString(3, u.getNombreDeUsuario()); 
            ps.setString(4, u.getContraseña()); 
            
            if(ps.executeUpdate() > 0)
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            return false;
        }
        finally
        {
            c.cerrarConexion();
        }
        return false;
    
    }
    
    public ArrayList<Usuario> readAll(){   
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try{
        ps = c.getConexion().prepareStatement(SQL_READ);
        rs = ps.executeQuery();
        while(rs.next()){
            usuarios.add(new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
        }
        }
        catch(SQLException e)
        {
            return null;
        }
        finally
        {
            c.cerrarConexion();
        }
        return usuarios;
    }
}
