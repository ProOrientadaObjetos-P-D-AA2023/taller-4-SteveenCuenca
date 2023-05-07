/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

public class Datos {

    String nombreEstudiante;
    int nota1;
    int nota2;
    int nota3;
    int prom = 0;

    public Datos(String nom, int n1, int n2, int n3) {
        nombreEstudiante = nom;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nom) {
        nombreEstudiante = nom;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int n1) {
        nota1 = n1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int n2) {
        nota2 = n2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int n3) {
        nota3 = n3;
    }

    public void calcularPromedio() {
        prom = (prom + nota1 + nota2 + nota3) / 3;
    }

    public int obtenerPromedio() {
        return prom;
    }
}
