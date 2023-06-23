package View;

import java.util.Scanner;

import Modelo.Estoque;
import Modelo.Ingrediente;

public class CriarIngrediente {
    Scanner ler = new Scanner(System.in);
    private int aux;
    
    public void criarIngrediente(Estoque estoque) {
        do {
        //crio o ingrediente que vai ser excluido quando sair do loop
        Ingrediente ingrediente = new Ingrediente();
        System.out.println("\n\n");

        System.out.println("Qual o nome do ingrediente?");
        ingrediente.setNome(ler.next()); 


        estoque.adicionaIngredientes(ingrediente);

        System.out.println("Deseja adicionar mais ingredientes?\n");
        System.out.println( "Digite 1 para seguir adicionando e 0 para sair");
        aux = ler.nextInt();

        } while (aux == 1);

        
    }

}
