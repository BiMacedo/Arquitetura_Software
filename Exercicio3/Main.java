/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {64, 25, 12, 22, 11};
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();
        
        Ordenador ordenador = new Ordenador(new InsertionSortStrategy());
        ordenador.ordenar(array1);
        System.out.println("Insertion Sort: " + Arrays.toString(array1));

        ordenador.setEstrategia(new SelectionSortStrategy());
        ordenador.ordenar(array2);
        System.out.println("Selection Sort: " + Arrays.toString(array2));

        ordenador.setEstrategia(new BubbleSortStrategy());
        ordenador.ordenar(array3);
        System.out.println("Bubble Sort: " + Arrays.toString(array3));
    }
}
