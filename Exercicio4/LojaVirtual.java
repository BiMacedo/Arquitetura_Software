/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

public class LojaVirtual {

    public static void main(String[] args) {
        // Produtos
        Promocao p1 = new Promocao("Produto A", 100, 0.10);
        Promocao p2 = new Promocao("Produto B", 150, 0.05);
        Promocao p3 = new Promocao("Produto C", 200, 0.20);
        Promocao p4 = new Promocao("Produto D", 50, 0.05);
        
        // Carrinho do Cliente João
        CarrinhoCompras carrinhoJoao = new CarrinhoCompras();
        carrinhoJoao.adicionar(p1);
        carrinhoJoao.adicionar(p2);
        
        // Pedido do Cliente João
        Pedido pedidoJoao = new Pedido("João", 12345);
        pedidoJoao.adicionarProduto(carrinhoJoao);
        
        // Carrinho do Cliente Maria
        CarrinhoCompras carrinhoMaria = new CarrinhoCompras();
        carrinhoMaria.adicionar(p3);
        carrinhoMaria.adicionar(p4);
        
        // Pedido do Cliente Maria
        Pedido pedidoMaria = new Pedido("Maria", 12346);
        pedidoMaria.adicionarProduto(carrinhoMaria);

        // Impressão dos detalhes dos pedidos
        imprimirDetalhesPedido(pedidoJoao);
        System.out.println("------------------------------------------------");
        imprimirDetalhesPedido(pedidoMaria);
    }

     public static void imprimirDetalhesPedido(Pedido pedido) {
        System.out.println("Pedido Número: " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Total do pedido: " + pedido.getTotalCompra());
    }
}