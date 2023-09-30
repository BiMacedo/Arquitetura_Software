/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class orcamento {
    private List<Double> valores;

    public orcamento() {
        this.valores = new ArrayList<>();
    }

    public void adicionarValor(double valor) {
        valores.add(valor);
    }

    public double getTotal() {
        return valores.stream().mapToDouble(Double::doubleValue).sum();
    }
}
