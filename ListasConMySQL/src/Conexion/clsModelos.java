/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author Sindy Barrera
 */
public class clsModelos {

    /**
     * @return the Id_Nombre
     */
    public int getId_Nombre() {
        return Id_Nombre;
    }

    /**
     * @param Id_Nombre the Id_Nombre to set
     */
    public void setId_Nombre(int Id_Nombre) {
        this.Id_Nombre = Id_Nombre;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    private int Id_Nombre;
    private String Nombre;
}
