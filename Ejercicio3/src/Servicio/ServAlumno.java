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
                System.out.print("    NOTA #" + i + ": ");
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

    public void notaFinal(int nombreAlumnoU) {
        //VARIABLE QUE GUARDA LAS 3 NOTAS
        double sum = 0;
        //Variable para calcular el promedio
        double prom;

        for (int i = 0; i < 3; i++) {
            sum += alumnos.get(nombreAlumnoU).getNotas().get(i);
        }
        prom = sum / 3;
        System.out.println("--------------------------------------------------");
        System.out.print(" EL PROMEDIO FINAL DE *" + 
                alumnos.get(nombreAlumnoU).getNombre().toUpperCase() + 
                "* ES: ");
        System.out.printf("%.2f", prom);
        System.out.println("");
        System.out.println("--------------------------------------------------");

    }

    public void pedirAlumno() {
        crearAlumno();
        int opcM;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                 MENU DE OPCIONES                 ");
            System.out.println("--------------------------------------------------");
            System.out.println(" 1. AGREGAR ALUMNO");
            System.out.println(" 2. NOTA FINAL POR ALUMNO");
            System.out.println(" 3. SALIR");
            System.out.println("--------------------------------------------------");
            System.out.print("   INGRESE UNA OPCION: ");
            opcM = scaner.nextInt();
            switch (opcM) {
                case 1:
                    scaner.nextLine();
                    crearAlumno();
                    break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println("                CALCULAR NOTA FINAL               ");
                    System.out.println("--------------------------------------------------");
                    mostrarAlumnos();
                    System.out.print("SELECCIONE UN ALUMNO: ");
                    int nombreAlum = scaner.nextInt();
                    notaFinal((nombreAlum - 1));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("---------------------------------------------------");
                    System.out.println("OPCION INCORRECTA, INTENTELO NUEVAMENTE");;
            }
        } while (opcM != 3);

    }

    public void mostrarAlumnos() {
        int cont = 1;
        for (Alumno aux : alumnos) {
            System.out.println(cont + ".-  " + aux.getNombre());
            cont++;
        }
    }
}
