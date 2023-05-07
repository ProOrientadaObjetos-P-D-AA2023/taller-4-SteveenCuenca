/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropiedadesCheque;

public class Cliente {

    String nomCliente;
    String apeCliente;

    public Cliente(String nomC, String apeC) {
        nomCliente = nomC;
        apeCliente = apeC;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomC) {
        nomCliente = nomC;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeC) {
        apeCliente = apeC;
    }

}
