
package controlador;

//METODOS DESDE "UsuarioServiceImpl" PARA FUNCIONALIDADES.
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Usuario;
import java.sql.SQLException;

public class UsuarioController {
    private static final String SQL_INSERT  = "INSERT INTO USUARIO VALUES(?,?,?,?)";
    private static final String SQL_UPDATE  = "UPDATE PACIENTE SET nombre = ?, genero = ?, edad = ?, direccion = ?, ciudad = ?, isapre = ?, donante = ? WHERE rut = ?";
    private static final String SQL_DELETE  = "DELETE FROM PACIENTE WHERE rut = ?";
    private static final String SQL_READ    = "SELECT * FROM PACIENTE WHERE rut = ?";
    private static final String SQL_READALL = "SELECT * FROM PACIENTE ORDER BY rut";
    
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
}
