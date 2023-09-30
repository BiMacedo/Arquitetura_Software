/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Produto> listaProdutos = new ArrayList<>();
    private int numeroPedido;

    public Pedido(String nomeCliente, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
    }

    public void adicionarProduto(Produto p) {
        listaProdutos.add(p);
    }

    public List<Produto> getProdutos() {
        return listaProdutos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getTotalCompra() {
        double total = 0;
        for (Produto produto : listaProdutos) {
            total += produto.getPreco();
        }
        return total;
    }
}