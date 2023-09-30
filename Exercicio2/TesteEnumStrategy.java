
package Exercicio2;

public class TesteEnumStrategy {
    public static void main(String[] args) {
        orcamento orcamento = new orcamento();
        orcamento.adicionarValor(100);
        orcamento.adicionarValor(50);
        
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        
        System.out.println("Imposto IP1: " + calculador.calcular(orcamento, TipoImposto.Ip1));
        System.out.println("Imposto IP2: " + calculador.calcular(orcamento, TipoImposto.Ip2));
        System.out.println("Imposto IP3: " + calculador.calcular(orcamento, TipoImposto.Ip3));
    }
}
