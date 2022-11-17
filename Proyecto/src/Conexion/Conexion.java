/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion{
    Connection conexion = null;
    public void conectar(){
        try{
            String url="jdbc:mysql://localhost:3306/tiendajuegos";
            String user="root";
            String password="";
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Lista");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void cerrar()throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }
    public Connection getConexion(){
        return conexion;
    }
}

