/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Pais implements Comparable<Pais>{
    private String Nombre;

    public Pais() {
    }

    public Pais(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public int compareTo(Pais o) {
        return this.Nombre.compareToIgnoreCase(o.getNombre());
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
    
}
