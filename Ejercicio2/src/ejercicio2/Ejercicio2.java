/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio2 {

    /*
    *Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    *un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    *está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    *ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    *la lista ordenada.
     */
    public static void main(String[] args) {
        //Instanciamos nuestro arrayList
        ArrayList<String> raza = new ArrayList();
        //Variable para salir del do-while
        String respuesta;
        //Variable que guarde la raza a edliminar
        String razaE;
        Scanner scaner = new Scanner(System.in);

        do {

            System.out.print("INGRESE LA RAZA DEL PERRO: ");
            raza.add(scaner.nextLine());

            System.out.println("DESEA INGRESAR OTRA RAZA DE PERRO? (Si/No)");
            respuesta = scaner.nextLine().toLowerCase();

        } while (respuesta.charAt(0)=='s');
        
        Collections.sort(raza);
        
        System.out.println("--------------------------------------------------");
        System.out.println("            RAZAS DE PERROS INGRESADAS            ");
        System.out.println("--------------------------------------------------");

        mostrarList(raza);

        System.out.println("--------------------------------------------------");
        System.out.println("DESEA ELIMINAR ALGUNA RAZA? (Si/No)");
        respuesta = scaner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.println("INGRESE LA RAZA A ELIMINAR: ");
            razaE = scaner.nextLine();

            Iterator<String> itPerro = raza.iterator();
            boolean bandera = false;
            while (itPerro.hasNext()) {
                if (itPerro.next().equals(razaE)) {
                    itPerro.remove();
                    bandera = true;
                }
            }

            if (bandera) {
                System.out.println("LA RAZA INGRESADA SI FUE ENCONTRADA Y ELIMINADA.");
                System.out.println("--------------------------------------------------");
                System.out.println("                  RAZAS DE PERROS                 ");
                System.out.println("--------------------------------------------------");
                mostrarList(raza);
            }else{
                System.out.println("LA RAZA NO FUE ENCONTRADA");
                System.out.println("--------------------------------------------------");
                System.out.println("                  RAZAS DE PERROS                 ");
                System.out.println("--------------------------------------------------");
                mostrarList(raza);
            }
        }
    }

    //--------------------------------------------------------------------------
    //Funcion mostrar lista
    public static void mostrarList(ArrayList<String> razaPerro) {
        int cont = 1;
        for (String aux : razaPerro) {
            System.out.println(cont + ".- " + aux);
            cont++;
        }
    }

}
