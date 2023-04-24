/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import Servicio.ServAlumno;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio3 {
    /*
    *Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
    *alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
    *con sus 3 notas.
    *
    *En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    *toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    *pregunta al usuario si quiere crear otro Alumno o no.
    *
    *Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    *
    *Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    *final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    *del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    *promedio final, devuelto por el método y mostrado en el main.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        ServAlumno servicio = new ServAlumno();
        //Scanner
        Scanner leer = new Scanner(System.in);
        servicio.crearAlumno();
        System.out.println("--------------------------------------------------");
        System.out.println("                CALCULAR NOTA FINAL               ");
        System.out.println("--------------------------------------------------");
        System.out.print("NOBRE ALUMNO: ");
        String nombreAlum = leer.nextLine();
        servicio.notaFinal(nombreAlum);
        
        
    }
    
}
