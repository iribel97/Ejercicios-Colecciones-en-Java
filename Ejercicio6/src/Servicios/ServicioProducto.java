/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServicioProducto {

    HashMap<Producto, Double> productos = new HashMap();

    Scanner scaner = new Scanner(System.in);

    /*
    *   introducir un elemento
     */
    public void crearProducto() {
        /*VARIABLES ----------------------------------------------------------------*/
        //nombre del producto
        String nombreP;
        //precio del producto
        double precio;

        /*PEDIR AL USUARIO ---------------------------------------------------------*/
        scaner.nextLine();
        
        System.out.print("NOMBRE DEL PRODUCTO: ");
        nombreP = scaner.nextLine();
        
        
        System.out.print("PRECIO: ");
        precio = scaner.nextDouble();
        //Agregar al HashMap
        productos.put(new Producto(nombreP), precio);
    }

    /*
    *   modificar su precio
     */
    public void modificarPrecio() {
        /*VARIABLES ----------------------------------------------------------------*/
        //nombre del producto a modificar
        String nombrePM;
        //variable del nuevo precio
        double nuevoP;

        /*PEDIR AL USUARIO ---------------------------------------------------------*/
        System.out.print("INGRESE EL NOMBRE DEL PRODUCTO A MODIFICAR EL PRECIO: ");
        nombrePM = scaner.nextLine();

        if (productos.containsKey(new Producto(nombrePM))) {
            System.out.print("INGRESE EL NUEVO PRECIO: ");
            nuevoP = scaner.nextDouble();
            productos.put(new Producto(nombrePM), nuevoP);
            System.out.println("EL PRECIO DEL PRODUCTO " + nombrePM + " HA SIDO MODIFICADO EXITOSAMENTE.");
        } else {
            System.out.println("EL PRODUCTO " + nombrePM + " NO EXISTE.");
        }
    }

    /*
    *   eliminar un producto 
     */
    public void eliminarProducto() {
        /*VARIABLES ----------------------------------------------------------------*/
        //nombre del producto a eliminar
        String nombrePE;

        scaner.nextLine();
        /*PEDIR AL USUARIO ---------------------------------------------------------*/
        System.out.print("INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR: ");
        nombrePE = scaner.nextLine();
        

        if (productos.containsKey(new Producto(nombrePE))) {
            productos.remove(new Producto(nombrePE));
            System.out.println("EL PRODUCTO " + nombrePE + " HA SIDO ELIMINADO EXITOSAMENTE.");
        } else {
            System.out.println("EL PRODUCTO " + nombrePE + " NO EXISTE.");
        }
    }

    /*
    *   mostrar los productos
     */
    
    public void mostrarProductos(){
        for(HashMap.Entry<Producto, Double> aux : productos.entrySet()){
            System.out.println(aux.getKey().getNombre() + "   ->    $ " + aux.getValue());
        }
    }
}
