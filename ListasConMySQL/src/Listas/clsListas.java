/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Conexion.clsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Sindy Barrera
 */


public class clsListas {
    
  public void listado(){

      clsConexion conex = new clsConexion();
      
        String nom;
        String NombreG;
        int cantidad=10;
        
        ArrayList<String> myList = new ArrayList<String>(); //Para almacenar todos los nombres
        ArrayList<String> listGan = new ArrayList<String>(); //Para almacenar solo los 10 ganadores del sorteo
        
       try{
            conex.AbrirConexion(); //Abriendo la conexion
            String criterio="select * from nombres ";
            Statement st = (Statement) conex.conexion.createStatement(); //Statement para enviar sentencias SQL a la base de datos
            ResultSet rs = st.executeQuery(criterio); //ResulSet para obtener los datos de mi columna de mi tabla         
            
            while (rs.next()){ //next para poder leer todos los datos que tengo almacenados
              nom=rs.getString("Nombres"); //get para mostrar los nombres de mi columna Nombres
              myList.add(nom); //add añadir los datos
            }
            
            System.out.println("¡¡¡BIENVENIDO AL SORTEO!!!\n");
            
            System.out.println("Lista completa de todos los participantes"+myList);
            System.out.println("\n");
            
       
            while(listGan.size() !=cantidad){  //.size para obtener el número de elementos en el ArrayList.
            Collections.shuffle(myList); //shuffle para desordenar la lista
            NombreG =myList.get(cantidad); //.get para obtener el valor de cantidad que es 10
            listGan.add(NombreG); //Agregando la lista de ganadores a NombresG
            myList.remove(NombreG); //.remove para que me borre los 10 nombres que selecciono y no se vuelvan a repetir
            }
            
            System.out.println("Personas ganadoras del sorteo:");
            Collections.sort(listGan); //Para ordenar automaticamente todos los nombres que estan en la lista
            imprimirTodo(listGan); //Llamando a la funcion y le indico que me imprima listGan la lista de ganadores
            
            System.out.println("\n\n");
            
            System.out.println("Personas que Perdieron:");
            Collections.sort(myList); //ya me ha removido los 10 ganadores por el .remove que puse en el while
            imprimirTodo(myList); //imprimiendo la lista de los perdedores
                       
            conex.CerrarConexion();
            
      }catch(SQLException ex){
            System.out.println("error:"+ ex.getMessage());
      }
       
   }
    
    public void imprimirTodo(Collection coll){
        Iterator iter = coll.iterator(); //Declarando el iterator
        //Mientras tenga algo
        while(iter.hasNext()){ //hasNext comprueba si el valor de la variable está dentro del rango
            System.out.println("Nombre = "+iter.next());
            
        }
    }
            
}
    
