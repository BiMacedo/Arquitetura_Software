/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

public class Ordenador {
    private EstrategiaOrdenacao estrategia;

    public Ordenador(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenar(int[] array) {
        estrategia.ordenar(array);
    }
}
