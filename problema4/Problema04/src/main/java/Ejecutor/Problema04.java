/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejecutor;

import PropiedadesCheque.Cheque;
import PropiedadesCheque.Cliente;

public class Problema04 {

    public static void main(String[] args) {

        System.out.println("Propiedades del cheque");

        String nomCliente = "Alejandro";
        String apeCliente = "Bustamante";

        Cliente c = new Cliente(nomCliente, apeCliente);

        String nomBanco = "Banco de Loja";
        double valorCheque = 150;

        Cheque p = new Cheque(nomBanco, valorCheque);

        p.calcularComision();

        System.out.println("El nombre del cliente es: " + c.getNomCliente() + c.getApeCliente());
        System.out.println("El banco al que se dirige el cheque es: " + p.getNomBanco());
        System.out.println("El valor del queque es: " + p.getValorCheque());
        System.out.println("La comison es de: " + p.obtenerComision());
    }
}


