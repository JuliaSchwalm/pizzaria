package View;

import java.util.Scanner;
import Modelo.Estoque;
import Modelo.Ingrediente;
import Modelo.Pizza;
import Modelo.Pizzaria;

public class CriarPizza {

    public CriarPizza(Pizzaria pizzaria, Estoque estoque) {
        this.pizzaria = pizzaria;
        this.estoque = estoque;
    }

    private Pizzaria pizzaria;
    private Estoque estoque;
    private int aux;
    Scanner ler = new Scanner(System.in);
    Pizza pizza = new Pizza();

    public void criarPizza() {
        //se tem ingredientes no estoque entra no if
        if (estoque.getIngredientes().size() != 0) {
            System.out.println("Agora você poderá criar uma nova pizza para ser inserida no cardápio\n");

            System.out.println("Qual é o nome da pizza?");
            pizza.setNome(ler.next());

            System.out.println("\n Lista de ingredientes disponiveis no estoque:\n");

            // imprime todos os ingredientes que tem no estoque
            for (int l = 0; l < estoque.getIngredientes().size(); l++) {
                System.out.println(estoque.getIngredientes().get(l).getNome());

            }

            System.out.println("\nQuais ingredientes terão na pizza?\n");

            for (int i = 0; i < estoque.getIngredientes().size(); i++) {
                // lista todos os ingredientes perguntando se quer adiciona-los na pizza
                System.out.println("DESEJA POR " + estoque.getIngredientes().get(i).getNome() + " NA PIZZA?\n");

                System.out.println("Digite 1 para adicionar e 0 se não quiser esse ingrediente na pizza:\n ");
                aux = ler.nextInt();

                // se o cliente digitar 1 vai adicionar na pizza
                if (aux == 1) {
                    pizza.adicionaIngredientes(estoque.getIngredientes().get(i));

                } else {
                    System.out.println('\n');
                }

            }
            // adiciona no array de pizzas da pizzaria
            pizzaria.getPizzas().add(pizza);
        } else {
            System.out.println("Voce nao pode criar a pizza, pois nao ha ingredientes no estoque!!!\n");
        }

    }

    public void editarPizza() {
        System.out.println("Digite o nome da pizza que você deseja editar?");
        String nomePizza = ler.next();
        // percorre o array de pizzas da pizzaria
        for (int i = 0; i < pizzaria.getPizzas().size(); i++) {
            // se a pizza digitada estiver na lista entra no if
            if (pizzaria.getPizzas().get(i).getNome().equals(nomePizza)) {
                System.out.println("Deseja alterar o nome?");
                System.out.println("Digite 1 para alterar e 0 para continuar com o mesmo nome.\n");
                int aux = ler.nextInt();

                // se o usuario quiser alterar entra no if
                if (aux == 1) {
                    System.out.println("Digite o novo nome da pizza");
                    String novoNome = ler.next();
                    pizzaria.getPizzas().get(i).setNome(novoNome);
                    System.out.println("Nome alterado com sucesso!\n");
                }

                // mexer nos ingredientes

                System.out.println("Deseja alterar algum ingrediente desta pizza?");
                System.out.println("Digite 1 para alterar e 0 para continuar com os mesmos ingredientes.\n");
                int aux2 = ler.nextInt();

                // se quiser alterar algum ingrediente entra no if
                if (aux2 == 1) {

                    System.out.println("Voce deseja remover ingredientes ou adicionar?");
                    System.out.println("Digite 1 para remover e 0 adicionar:\n");
                    int aux3 = ler.nextInt();
                    // se quiser remover entra no if
                    if (aux3 == 1) {
                        System.out.println("Qual ingrediente voce deseja remover?");
                        String ingred = ler.next();
                        // percorre o array de ingredientes de cada uma das pizzas
                        // que estão dentro do array pizzas na pizzaria
                        for (int j = 0; j < pizzaria.getPizzas().get(i).getIngredientes().size(); j++) {
                            // se o ingrediente digitado estiver na pizza em que é desejada (posicao i)
                            // entra no if
                            // e remove o ingrediengte da pizza
                            if (pizzaria.getPizzas().get(i).getIngredientes().get(j).getNome().equals(ingred)) {
                                pizzaria.getPizzas().get(i).getIngredientes().remove(j);
                                System.out.println(" o ingrediente foi removido da pizza!\n");
                            }
                        }
                    } else {
                        // se ele quiser adicionar mais ingredientes a pizza entra no else

                        // lista os ingredientes disponiveis no estoque
                        System.out.println("Lista de todos os ingredientes do estoque:\n");
                        for (int l = 0; l < estoque.getIngredientes().size(); l++) {
                            System.out.println(estoque.getIngredientes().get(l).getNome());

                        }
                        System.out.println("Digite o nome do ingrediente que deseja adicionar");
                        String testeIngred = ler.next();
                        // percorre os ingredientes disponiveis
                        for (int l = 0; l < estoque.getIngredientes().size(); l++) {
                            // se o ingrediente ta no estoque, ou seja, existe entra no if
                            if (estoque.getIngredientes().get(l).getNome().equals(testeIngred)) {
                                // teste se o ingrediente ja esta na pizza ou nao
                                for (int a = 0; a < pizzaria.getPizzas().get(i).getIngredientes().size(); a++) {
                                    // se o ingrediente ja compoe a pizza entra no if
                                    if (pizzaria.getPizzas().get(i).getIngredientes().get(a).getNome()
                                            .equals(testeIngred)) {
                                        System.out.println("esse ingrediente já esta na pizza");
                                        break;
                                    }
                                }
                                // se ainda não esta na pizza e ele existe
                                // entao é adicionado na pizza
                                pizzaria.getPizzas().get(i).getIngredientes().add(estoque.getIngredientes().get(l));
                                System.out.println("ingrediente adicionado na pizza!");

                            }
                        }
                    }
                }
            }
        }
    }

    public void removerPizza() {
        // simplesmente remove a pizza do cardapio
        System.out.println("digite o nome da pizza que deseja remover:");
        String nomePizza = ler.next();

        for (int i = 0; i < pizzaria.getPizzas().size(); i++) {
            if (pizzaria.getPizzas().get(i).getNome().equals(nomePizza)) {
                pizzaria.getPizzas().remove(i);
            }
        }
    }

}
