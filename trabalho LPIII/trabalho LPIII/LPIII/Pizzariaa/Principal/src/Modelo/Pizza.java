package Modelo;

import java.util.ArrayList;

public class Pizza {
    private String nome;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza() {

    }

    @Override
    public String toString() {
        return "Pizza [nome=" + nome + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void adicionaIngredientes(Ingrediente ingred) {
        ingredientes.add(ingred);

    }

    public void imprimirIngredientes() {
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println(ingredientes.get(i).getNome());
        }
    }

}
