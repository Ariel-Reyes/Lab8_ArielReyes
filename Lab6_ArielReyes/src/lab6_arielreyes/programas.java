/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielreyes;

/**
 *
 * @author Ariel
 */
public class programas {
    String nombre; 
    int puntuacion; 
    int year_lanzamiento; 
    String tipo; 
    String genero; 

    public programas() {
    }

    public programas(String nombre, int puntuacion, int year_lanzamiento, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.year_lanzamiento = year_lanzamiento;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getYear_lanzamiento() {
        return year_lanzamiento;
    }

    public void setYear_lanzamiento(int year_lanzamiento) {
        this.year_lanzamiento = year_lanzamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  nombre ;
    }


}
