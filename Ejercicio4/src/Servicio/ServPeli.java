/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServPeli {

    Scanner scaner = new Scanner(System.in);

    ArrayList<Pelicula> movies = new ArrayList();

    /*
    *   - En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    *       todos sus datos y guardándolos en el objeto Pelicula.
    *   - Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    *       crear otra Pelicula o no.
     */
    public void crearPeli() {
        //Variables para nombre y director de la peli
        String nombPeli, nomDirect;
        //Variable para la duracion de la peli
        int timePeli;
        //variable para guardar la cantidad de peliculas quiere el usuario
        int cantPeli;
        //variable para contar cuantas peliculas va ingresando
        int contPeli = 1;
        //variable para el if
        String opc;
////------------------------------------------------------------------------------
        //Pedir al usuario cuantas peliculas va a ingresar
        System.out.println("--------------------------------------------------");
        System.out.print("CUANTAS PELICULAS VA A INGRESAR?: ");
        cantPeli = scaner.nextInt();
        //Bucle para pedir los datos de las peliculas
        do {

            System.out.println("--------------------------------------------------");
            System.out.println("                   PELICULA #" + contPeli);
            System.out.println("--------------------------------------------------");
            scaner.nextLine();
            System.out.print("    NOMBRE: ");
            nombPeli = scaner.nextLine();

            System.out.print("    DIRECTOR: ");
            nomDirect = scaner.nextLine();
            System.out.print("    DURACION: ");
            timePeli = scaner.nextInt();
            //AGREGAR LA PELICULA EN LA LISTA
            movies.add(new Pelicula(nombPeli, nomDirect, timePeli));

            if (contPeli == cantPeli) {
                System.out.println("Desea agregar mas peliculas? (Si,No): ");
                opc = scaner.next().toLowerCase();
                if (opc.charAt(0) == 's') {
                    System.out.println("--------------------------------------------------");
                    System.out.print("CUANTAS PELICULAS VA A INGRESAR?: ");
                    cantPeli += scaner.nextInt();
                }
            }
            contPeli++;
        } while (contPeli <= cantPeli);
    }

    /*
    *       • Mostrar en pantalla todas las películas.
     */
    public void mosrarPelis() {
        int cont = 1;
        for (Pelicula peli : movies) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("                                       PELICULA #" + cont);
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("|  TITULO: " + peli.getTitle()
                    + "  |  DIRECTOR: " + peli.getDirector()
                    + "  |  DURACION: " + peli.getMovieTime() + " h  |");
            cont++;
        }
    }

    /*
    *       • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
     */
    public void mostrarPelisHora() {
        int cont = 1;
        for (Pelicula peli : movies) {
            if (peli.getMovieTime() > 1) {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("                                       PELICULA #" + cont);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("|  TITULO: " + peli.getTitle()
                        + "  |  DIRECTOR: " + peli.getDirector()
                        + "  |  DURACION: " + peli.getMovieTime() + " h  |");
                cont++;
            }

        }
    }

    /*
    *       • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    *           pantalla.
     */
    public void peliculasPorDuracionMayor() {
        // Comparador personalizado para ordenar por duración de mayor a menor
        Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p2.getMovieTime(), p1.getMovieTime());
            }
        };
        // Ordenar la lista de películas usando el comparador
        Collections.sort(movies, comparadorDuracion);
        // Mostrar las películas ordenadas por duración
        mosrarPelis();
    }

    /*
    *       • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    *           pantalla.
     */
    public void peliculasPorDuracionMenor() {
        // Comparador personalizado para ordenar por duración de mayor a menor
        Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Integer.compare(p1.getMovieTime(), p2.getMovieTime());
            }
        };
        // Ordenar la lista de películas usando el comparador
        Collections.sort(movies, comparadorDuracion);
        // Mostrar las películas ordenadas por duración
        mosrarPelis();
    }

    /*
    *       • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    */
    public void peliculasPorTitulo() {
        // Definir un Comparator que compare las películas por título, alfabéticamente
        Comparator<Pelicula> comparadorPorTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitle().compareTo(p2.getTitle());
            }
        };
        // Ordenar la lista de películas usando el comparador
        Collections.sort(movies, comparadorPorTitulo);
        // Mostrar las películas ordenadas por duración
        mosrarPelis();
    }
    
    /*
    *       • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    */
    
    public void peliculasPorDirect(){
        // Definir un Comparator que compare las películas por Director, alfabéticamente
        Comparator<Pelicula> comparadorPorDirector = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        };
        // Ordenar la lista de películas usando el comparador
        Collections.sort(movies, comparadorPorDirector);
        // Mostrar las películas ordenadas por duración
        mosrarPelis();
    }
}
