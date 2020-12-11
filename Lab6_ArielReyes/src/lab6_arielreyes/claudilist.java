/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielreyes;

import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class claudilist {
    String nombre ; 
    ArrayList<programas> progra = new ArrayList(); 

    public claudilist(String nombre) {
        this.nombre = nombre;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<programas> getProgra() {
        return progra;
    }

    public void setProgra(ArrayList<programas> progra) {
        this.progra = progra;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
    
}
