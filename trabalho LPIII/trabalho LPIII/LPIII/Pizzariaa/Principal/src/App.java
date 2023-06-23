import Modelo.Pizzaria;
import View.CriarCliente;
import View.CriarIngrediente;
import View.CriarPedido;
import View.CriarPizza;
import java.util.Scanner;
import Modelo.Estoque;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        System.out.println("\n\n");

        System.out.println("\n\n\n\n\n");
        Pizzaria pizzaria = new Pizzaria();
        Estoque estoque = new Estoque();

        do {
            System.out.println("1: NOVO INGREDIENTE;\n" +
                    "2: NOVA PIZZA; \n" +
                    "3: NOVO PEDIDO; \n" +
                    "4: NOVO CLIENTE; \n" +
                    "5: EDITAR PIZZAS; \n" +
                    "6: VER O CARDAPIO; \n" +
                    "7: REMOVER PIZZA DO CARDAPIO; \n" +
                    "0: para sair.\n");

            System.out.println("o que você deseja fazer:\n");
            num = ler.nextInt();

            switch (num) {
                case 1:
                    CriarIngrediente novoIngrediente = new CriarIngrediente();
                    novoIngrediente.criarIngrediente(estoque);
                    break;

                case 2:
                    CriarPizza criarPizza = new CriarPizza(pizzaria, estoque);
                    criarPizza.criarPizza();
                    break;

                case 3:
                    CriarPedido novoPedido = new CriarPedido();
                    novoPedido.novoPedido(pizzaria);
                    break;

                case 4:
                    CriarCliente criarCliente = new CriarCliente(pizzaria);
                    criarCliente.novoCliente();
                    break;

                case 5:
                    CriarPizza editarPizza = new CriarPizza(pizzaria, estoque);
                    editarPizza.editarPizza();
                    break;

                case 6:
                    pizzaria.imprimirPizzas();
                    break;

                case 7:
                    CriarPizza removerPizza = new CriarPizza(pizzaria, estoque);
                    removerPizza.removerPizza();
                    break;

                case 0:
                    System.out.println("Finalizado com sucesso!");
                    break;

                default:
                    System.out.println("numero não identificado");
                    break;
            }

        } while (num != 0);

    }

}
