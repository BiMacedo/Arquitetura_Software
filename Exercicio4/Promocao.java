/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

public class Promocao implements Produto {
    private String nome;
    private double preco;
    private double desconto;

    public Promocao(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco - (preco * desconto);
        this.desconto = desconto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}







