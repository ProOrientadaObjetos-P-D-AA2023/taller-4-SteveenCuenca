/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropiedadesCheque;

public class Cheque {

    String nomBanco;
    double valorCheque;
    double comision;

    public Cheque(String nomB, double valorC) {
        nomBanco = nomB;
        valorCheque = valorC;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomB) {
        nomBanco = nomB;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorC) {
        valorCheque = valorC;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public double obtenerComision() {
        return comision;
    }
}
