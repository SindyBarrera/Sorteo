/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaPuntos;

/**
 *
 * @author Sindy Barrera
 */
public class Nodo {
    int dato;
    Nodo enlace;
    
    //Constructor 
    public Nodo(int x){//Pasando el primer dato
        dato = x;
        enlace = null; //Nulo porque es el pirmero nodo por lo que no tiene sucesor
    }
    //Segundo constructor
    public Nodo(int x, Nodo nuevo){ //Pasando como parametro el dato y el nodo nuevo
        dato = x;
        enlace = nuevo;
    }
    
    //Metodos para que nos devuelva la informacion
    public int getDato(){ //Para que nos devuelva el dato
        return dato;
    }
    public Nodo getEnlace(){ //Para que nos devuelva el enlace
        return enlace;
    }
    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
    
}

