/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio1 {
    /*
    *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    *programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    *después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    *salir, se mostrará todos los perros guardados en el ArrayList.
    */
    public static void main(String[] args) {
        //Instanciamos nuestro arrayList
        ArrayList<String> raza = new ArrayList();
        //Variable para salir del do-while
        String respuesta;
        Scanner scaner  = new Scanner(System.in);
        
        do {
           
            System.out.print("INGRESE LA RAZA DEL PERRO: ");
            raza.add(scaner.nextLine());
            
            System.out.println("DESEA INGRESAR OTRA RAZA DE PERRO? (Si/No)");
            respuesta = scaner.nextLine().toLowerCase();
            
        } while (respuesta.equals("si"));
        
        System.out.println("--------------------------------------------------");
        System.out.println("            RAZAS DE PERROS INGRESADAS            ");
        System.out.println("--------------------------------------------------");
        int cont = 1;
        for(String aux : raza){
            System.out.println(cont + ".- " + aux);
            cont++;
        }
    }
    
}
