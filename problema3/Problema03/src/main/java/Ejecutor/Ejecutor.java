/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejecutor;

import CaracteristicasAutomotor.Caracteristicas;

public class Ejecutor {

    public static void main(String[] args) {
        System.out.println("Caracteristicas de un automotor: ");

        String ceDueño = "1105836473";
        String marVehiculo = "Chevrolet";
        int añoFab = 2007;
        double valorVehiculo = 44.654;

        Caracteristicas c = new Caracteristicas(ceDueño, marVehiculo, añoFab, valorVehiculo);
        
        c.calcularMatricula();
        
        System.out.println("El numero de cedula del dueño es: "+ c.getCeDueño());
        System.out.println("La marca del vehiculo es: "+ c.getMarVehiculo());
        System.out.println("El año d fabricación del vehiculo es: "+ c.getAñoFab());
        System.out.println("El valor del vehiculo es de: "+ c.getValorVehiculo());
        System.out.printf("El valor total de la matricula es de: %.2f", c.obtenerMatricula());
    }
}
