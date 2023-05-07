/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaracteristicasAutomotor;

public class Caracteristicas {

    String ceDueño;
    private String marVehiculo;
    private int añoFab;
    private double valorVehiculo;
    private int añoAct = 2023;
    private double valorMat;

    public Caracteristicas(String ceD, String marV, int añoF, double valorV) {
        ceDueño = ceD;
        marVehiculo = marV;
        añoFab = añoF;
        valorVehiculo = valorV;
    }

    public String getCeDueño() {
        return ceDueño;
    }

    public void setCeDueño(String ceD) {
        ceDueño = ceD;
    }

    public String getMarVehiculo() {
        return marVehiculo;
    }

    public void setMarVehiculo(String marV) {
        marVehiculo = marV;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoF) {
        añoFab = añoF;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public int getAñoAct() {
        return añoAct;
    }

    public void setAñoAct(int añoA) {
        añoAct = añoA;
    }

    public void calcularMatricula(){
        valorMat = (0.02 * valorVehiculo) * (añoAct - añoFab);
    } 
    
    public double obtenerMatricula(){
        return valorMat;
    }
}
