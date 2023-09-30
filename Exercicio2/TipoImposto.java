/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Exercicio2;

public enum TipoImposto {
    Ip1(0.10),
    Ip2(0.15),
    Ip3(0.25);

    private final double taxa;

    TipoImposto(double taxa) {
        this.taxa = taxa;
    }

    public double calcularImposto(double valor) {
        return valor * this.taxa;
    }
}
