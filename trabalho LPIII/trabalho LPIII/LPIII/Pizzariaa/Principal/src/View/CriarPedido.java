package View;

import java.util.Scanner;

import Modelo.Pedido;
import Modelo.Pizzaria;

public class CriarPedido {
    Scanner ler = new Scanner(System.in);

    public void novoPedido(Pizzaria pizzaria) {
        int aux = 0;
        Pedido pedido = new Pedido();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = ler.next();
        for (int i = 0; i < pizzaria.getClientes().size(); i++) {
            if (pizzaria.getClientes().get(i).getNome().equals(nomeCliente)) {
                pedido.setCliente(pizzaria.getClientes().get(i));
            }
        }
        do {
            System.out.println("Digite o nome da pizza que você quer?");
            String nomePizza = ler.next();
            for (int i = 0; i < pizzaria.getPizzas().size(); i++) {
                if (pizzaria.getPizzas().get(i).getNome().equals(nomePizza)) {
                    pedido.adicionaPizza(pizzaria.getPizzas().get(i));

                }
            }

            System.out.println("Qual o tamanho da pizza?");
            pedido.setTamanhoPizza(ler.next().charAt(0));

            System.out.println("Deseja adicionar mais pizzas ao pedido?");
            System.out.println("Digite 1 para seguir adicionando e 0 para sair");
            aux = ler.nextInt();

        } while (aux == 1);
    }

}
