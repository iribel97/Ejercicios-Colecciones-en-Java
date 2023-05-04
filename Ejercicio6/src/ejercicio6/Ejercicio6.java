/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import Servicios.ServicioProducto;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio6 {
    /*
    *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    *productos que venderemos y el precio que tendrán. Además, se necesita que la
    *aplicación cuente con las funciones básicas.
    *
    *Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    *eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    *Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    *Realizar un menú para lograr todas las acciones previamente mencionadas.
    */
    public static void main(String[] args) {
        ServicioProducto service = new ServicioProducto();
        
        Scanner scaner = new Scanner(System.in);
        
        int cont = 1, opc;
        
        System.out.println("--------------------------------------------------");
        System.out.print(" CUANTOS PRODUCTOS VA A INGRESAR? ");
        int cant = scaner.nextInt();
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 PRODUCTO #"+cont);
            System.out.println("--------------------------------------------------");
            
            service.crearProducto();
            
            cont++;
        } while (cont <= cant);
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 MENU DE OPCIONES                 ");
            System.out.println("--------------------------------------------------");
            System.out.println("   1. INGRESAR PRODUCTO");
            System.out.println("   2. MOSTRAR PRODUCTOS");
            System.out.println("   3. ELIMINAR PRODUCTO");
            System.out.println("   4. MODIFICAR PRECIO");
            System.out.println("   5. SALIR");
            System.out.println("--------------------------------------------------");
            System.out.print("  ELIJA UNA OPCION: ");
            opc = scaner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("----------------------------------------------");
                    service.crearProducto();
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    service.mostrarProductos();
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    service.eliminarProducto();
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    service.modificarPrecio();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("OPCION NO ENCONTRADA, INTENTELO DE NUEVO.");
            }
        } while (opc != 5);
    }
    
}
