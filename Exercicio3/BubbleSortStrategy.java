/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

public class BubbleSortStrategy implements EstrategiaOrdenacao {
    @Override
    public void ordenar(int[] v) {
        int i, j, temp;
        for (j = 0; j < v.length - 1; j++) {
            for (i = 0; i < v.length - 1 - j; i++) {
                if (v[i] > v[i+1]) {
                    temp = v[i];
                    v[i] = v[i+1];
                    v[i+1] = temp;
                }
            }
        }
    }
}