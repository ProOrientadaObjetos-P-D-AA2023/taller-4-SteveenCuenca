/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejecutor;

import Datos.Datos;

public class Ejecutor {

    public static void main(String[] args) {
        System.out.println("Notas de estudiante");

        String nEstudiante = "Daniela Sandoval";
        int nota1 = 8;
        int nota2 = 9;
        int nota3 = 7;

        Datos d = new Datos(nEstudiante, nota1, nota2, nota3);

        d.calcularPromedio();

        System.out.println("El nombre del estudiante es: " + d.getNombreEstudiante());
        System.out.println("Y tiene un promedio de:  " + d.obtenerPromedio());
    }
}
