/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejecutor;

import SueldoBasico.Sueldo;
import SueldoBasico.Dprofesor;

public class Ejecutor {

    public static void main(String[] args) {
        System.out.println("Representacion del sueldo de un profesor:");

        String nombre = "Sebastián";
        String apellido = "Perez";

        Dprofesor d = new Dprofesor(nombre, apellido);

        int cedula = 1105906035;
        double sueldoBasico = 450;

        Sueldo s = new Sueldo(cedula, sueldoBasico);

        s.calcularIva();

        System.out.println("EL nombre del profesor es: " + d.getNombre() + d.getApellido());
        System.out.println("Con numero de cedula: " + s.getCedula());
        System.out.println("Con un sueldo de: " + s.obtenerSueldoT());
    }
}
