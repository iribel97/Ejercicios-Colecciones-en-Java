/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author irina
 */
public class ServPais {

    Scanner scaner = new Scanner(System.in);

    TreeSet<Pais> paises = new TreeSet();

    /*
    *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    *usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    *conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    *si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    *los servicios en la clase correspondiente).
     */
    public void ingresarPais() {

        // VARIABLES -------------------------------------------------------------------
        //variable para la cantidad de paises que el usuario va a ingresar
        int cantP;
        //variable para contar los paises ingresados
        int contP = 1;
        //variable para el if
        String opc;
        //Variable que guarde el nombre del pais
        String nomPais;
        //------------------------------------------------------------------------------
        System.out.println("CANTIDAD DE PAISES A INGRESAR: ");
        cantP = scaner.nextInt();
        scaner.nextLine();
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                  PAIS #" + contP);
            System.out.println("--------------------------------------------------");
            
            System.out.print("   NOMBRE: ");
            nomPais = scaner.nextLine();
            paises.add(new Pais(nomPais));
            if (contP == cantP) {
                System.out.println("--------------------------------------------------");
                System.out.println("   DESEA INGRESAT MAS PAISES? (Si/No) ");
                opc = scaner.nextLine().toLowerCase();
                if (opc.charAt(0) == 's') {
                    System.out.println("CANTIDAD DE PAISES A INGRESAR: ");
                    cantP += scaner.nextInt();
                }
                scaner.nextLine();
            }
            contP++;
        } while (contP <= cantP);
    }

    /*
    *Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    *cómo se ordena un conjunto.
     */
    public void mostrarPais() {
        int cont = 1;
        System.out.println("--------------------------------------------------");
        System.out.println("             LOS PAISES INGRESADOS SON            ");
        System.out.println("--------------------------------------------------");
        for (Pais country : paises) {
            System.out.println("   " + cont + ".- " + country.getNombre());
            cont++;
        }
    }

    /*
    *Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    *buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    *usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    *al usuario.
     */
    public void eliminarPais() {
        System.out.println("--------------------------------------------------");
        System.out.println("             VAMOS A ELIMINAR UN PAIS             ");
        System.out.println("--------------------------------------------------");
        System.out.println("INGRESE NOMBRE: ");
        String opcionP = scaner.nextLine();
        //Variable booleana que me va a confirmar si esta o no el pais que digito
        boolean bandera = false;
        //Instanciar Iterador
        Iterator<Pais> itPais = paises.iterator();
        //Verifivar si se encuentra
        while (itPais.hasNext()) {
            if (itPais.next().getNombre().equalsIgnoreCase(opcionP)) {
                bandera = true;
            }
        }
        //En caso de que de verdadero, se va a eliminar
        if (bandera) {
            System.out.println("--------------------------------------------------");
            System.out.println("PAIS ENCONTRADO");
            Iterator<Pais> itPais2 = paises.iterator();
            while (itPais2.hasNext()) {
                if (itPais2.next().getNombre().equalsIgnoreCase(opcionP)) {
                    itPais2.remove();
                }
            }
            
        }else{
            System.out.println("--------------------------------------------------");
            System.out.println("PAIS NO SE ENCONTRO");
        }

    }
}
