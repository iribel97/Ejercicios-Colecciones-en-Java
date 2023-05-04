/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.HashMap;
//import java.util.Objects;

/**
 *
 * @author irina
 */
public class Producto {

    /*
    *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    *productos que venderemos y el precio que tendrán.
     */

    private HashMap<String, Double> product = new HashMap();

    public Producto() {
    }

    public HashMap<String, Double> getProduct() {
        return product;
    }

    public void setProduct(String nombre, Double precio) {
        this.product.put(nombre, precio);
    }

    

    
}
