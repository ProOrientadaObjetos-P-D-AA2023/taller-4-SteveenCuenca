/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SueldoBasico;

public class Sueldo {

    private int cedula;
    private double sueldoBasico;
    private double porcentajeSueldo;

    public Sueldo(int cedu, double sueldoBa) {
        cedula = cedu;
        sueldoBasico = sueldoBa;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int ced) {
        cedula = ced;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBa) {
        sueldoBasico = sueldoBa;
    }

    public void calcularIva() {
        porcentajeSueldo = sueldoBasico * .12;
    }

    public double obtenerSueldoT() {
        sueldoBasico = sueldoBasico + porcentajeSueldo;
        return sueldoBasico;
    }
}
