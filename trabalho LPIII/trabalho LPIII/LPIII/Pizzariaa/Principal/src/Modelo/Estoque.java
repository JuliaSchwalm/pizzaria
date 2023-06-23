package Modelo;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public void adicionaIngredientes(Ingrediente ingred) {
        ingredientes.add(ingred);

    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
