/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaPuntos;

import java.util.Scanner;

/**
 *
 * @author Sindy Barrera
 */
public class Lista {
    private Nodo primero; 
    
    //Constructor
    public Lista(){
        primero = null;
        
    }
    
    //Creando la funcion para leer los numeros que se estan ingresando
    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para finalizar");
        return Integer.parseInt(new Scanner (System.in).nextLine());//Para que nos regrese el numero ingresado 
    }
    
    
    public Lista crearLista(){
        int x;
        primero = null; //Inicializamos el primer dato como nulo
        
        do{
            x = leerEntero(); //Para que nos lea Entero
            if(x != -1){
                primero = new Nodo(x,primero);
            }
            
        }while (x != -1);
        
        return this;
    }
    
}

