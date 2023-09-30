/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

public class InsertionSortStrategy implements EstrategiaOrdenacao {
    @Override
    public void ordenar(int[] v) {
        int i, j, temp;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j-1] >= temp) {
                v[j] = v[j-1];
                j--;
            }
            v[j] = temp;
        }
    }
}