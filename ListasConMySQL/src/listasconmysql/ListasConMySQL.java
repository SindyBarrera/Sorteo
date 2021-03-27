/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasconmysql;

import Conexion.clsConexion;
import Conexion.clsModelos;
import Listas.clsListas;
import java.util.Scanner;

/**
 *
 * @author Sindy Barrera
 */

public class ListasConMySQL {

    public static void Ingresar(){
        Scanner s = new Scanner(System.in);
        String nombres;
        
        clsConexion conn = new clsConexion();
        clsModelos mod = new clsModelos();
        System.out.println("Ingrese el nombre: ");
        nombres = s.next();
        mod.setNombre(nombres);
        conn.insertarNombre(mod);   
    }
    
    
    public static void mostrar(){
      
    }
    
    public static void main(String[] args) {
        
        
         //new clsListas().ejemplo1();
       
        clsConexion conn = new clsConexion();
        //Ingresar();
        
        
        clsListas listado = new clsListas();
        listado.listado();
        
        
        //PROBANDO LA CONEXION
//        conn.AbrirConexion();
//        conn.CerrarConexion();
        
          
    }
    
}
