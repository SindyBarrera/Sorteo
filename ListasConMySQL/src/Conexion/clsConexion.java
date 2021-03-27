/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Sindy Barrera
 */
public class clsConexion {
   
    //Connection para proporcionar el vínculo entre la base de datos y mi aplicacion en Java
    public Connection conexion;
    private final String servidor_conexion = "jdbc:mysql://localhost:3306/nombresp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static private final String usuario = "sindydb";
    static private final String clave = "1234";
    
    
    public void AbrirConexion()
    {
        try
        {
            //DriverManager para gestionar el conjunto de controladores
            conexion = (Connection) DriverManager.getConnection(servidor_conexion, usuario, clave);
            System.out.println("Conexion exitosa");   
        }
        catch(SQLException ex)
        {
           System.out.println("Error: "+ex.getMessage());
        }
    }
    
    
    public void CerrarConexion()
    {
        try
        {
            conexion.close();
        }
        catch(SQLException ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        }
    }
    
    
    public void insertarNombre(clsModelos p){
       String Query="";
       Query += "INSERT INTO `nomnbres`("
                                + "`Nombres`" +
                                 ")  values ";
       String valores="";
       valores ="('"+p.getNombre()+"')";
       Query += valores; 
       
       AbrirConexion();
       
       Statement s; //Statement para enviar sentencias SQL a la base de datos
       
       try{
          s = (Statement) conexion.createStatement(); //createStatement para crear el objeto que modela a la sentencia SQL
          int res = s.executeUpdate(Query); //para ejecutar sentencias INSERT, UPDATE ó DELETE
         
       }catch(SQLException ex){
        CerrarConexion();    System.out.println("Error:"+ex.getMessage());
       }
       CerrarConexion(); 
   }
    
         
}

