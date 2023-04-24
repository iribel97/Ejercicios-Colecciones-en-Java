/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Servicio.ServPeli;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio4 {

    /*
    *Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    *tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    *Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    *que se pide a continuación:
    *
    *   - En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    *       todos sus datos y guardándolos en el objeto Pelicula.
    *   - Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    *       crear otra Pelicula o no.
    *   - Después de ese bucle realizaremos las siguientes acciones:
    *       • Mostrar en pantalla todas las películas.
    *       • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    *       • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    *           pantalla.
    *       • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    *           pantalla.
    *       • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    *       • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcM; 
        
        ServPeli service = new ServPeli();

        service.crearPeli();
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 MOSTRAR PELICULAS                ");
            System.out.println("--------------------------------------------------");
            System.out.println("    1.- TODAS");
            System.out.println("    2.- PELICULAS MAS DE 1 HORA");
            System.out.println("    3.- DE ACUERDO A SU DURACION (MAYOR A MENOR)");
            System.out.println("    4.- DE ACUERDO A SU DURACION (MENOR A MAYOR)");
            System.out.println("    5.- ALFABETICAMENTE POR TITULO");
            System.out.println("    6.- ALFABETICAMENTE POR DIRECTOR");
            System.out.println("--------------------------------------------------");
            System.out.println("    7.- SALIR");
            System.out.print("    SELECCIONE UNA OPCION: ");
            opcM = leer.nextInt();
            
            switch (opcM) {
                case 1:
                    service.mosrarPelis();
                    break;
                case 2:
                    service.mostrarPelisHora();
                    break;
                case 3:
                    service.peliculasPorDuracionMayor();
                    break;
                case 4:
                    service.peliculasPorDuracionMenor();
                    break;
                case 5:
                    service.peliculasPorTitulo();
                    break;
                case 6:
                    service.peliculasPorDirect();
                    break;
                case 7:
                    
                    break;
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("OPCION NO ENCONTRADA, INTENTELO DE NUEVO");
            }
        } while (opcM != 7);

    }

}
