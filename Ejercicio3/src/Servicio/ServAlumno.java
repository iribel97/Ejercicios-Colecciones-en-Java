/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServAlumno {

    int contAlumno = 1;
    Scanner scaner = new Scanner(System.in);
    public ArrayList<Alumno> alumnos = new ArrayList();

    /*
    *En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    *toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    *pregunta al usuario si quiere crear otro Alumno o no.
     */
    public void crearAlumno() {

        //Guardar el nombre del alumno
        String nombreA;
        //Guardar la opcion del do-while
        String seleccion1;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("         INGRESE DATOS DEL ALUMNO #" + contAlumno);
            System.out.println("--------------------------------------------------");
            System.out.print("  ESTUDIANTE: ");
            nombreA = scaner.nextLine();
            //Lista que guarde las notas que va a llenar la lista principal
            ArrayList<Double> notasS = new ArrayList();
            for (int i = 1; i <= 3; i++) {
                System.out.print(" NOTA #" + i + ": ");
                notasS.add(scaner.nextDouble());
            }

            alumnos.add(new Alumno(nombreA, notasS));
            scaner.nextLine();
            System.out.println("--------------------------------------------------");
            System.out.println("DESEA INGRESAR OTRO ALUMNO? (Si/No)");
            seleccion1 = scaner.nextLine().toLowerCase();
            contAlumno++;
        } while (seleccion1.charAt(0) == 's');
    }

    public void notaFinal(String nombreAlumnoU) {
        //INSTANCIAR EL ITERADOR
        Iterator<Alumno> itAlum = alumnos.iterator();
        //VARIABLE QUE GUARDA LAS 3 NOTAS
        double sum = 0;
        //Variable para calcular el promedio
        double prom;
        //booleano para saber si se encuentra
        boolean bandera = false;
        while (itAlum.hasNext()) {
            if (itAlum.next().getNombre().equals(nombreAlumnoU)) {
                for (int i = 0; i < 3; i++) {
                    sum += itAlum.next().getNotas().get(i);
                }
                bandera = true;
                break;
            }
        }
        if (bandera) {
            prom = sum / 3;
            System.out.println("--------------------------------------------------");
            System.out.println("EL PROMEDIO FINAL DEL ALUMNO ES: " + prom);
            System.out.println("--------------------------------------------------");
        }else{
            System.out.println("--------------------------------------------------");
            System.out.println("ESTUDIANTE NO ENCONTRADO");
        }

    }

}
