/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

public class CalculadorDeImpostos {
    public double calcular(orcamento orcamento, TipoImposto tipoImposto) {
        return tipoImposto.calcularImposto(orcamento.getTotal());
    }
}
