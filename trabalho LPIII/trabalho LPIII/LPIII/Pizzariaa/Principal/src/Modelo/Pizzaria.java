package Modelo;

import java.util.ArrayList;

public class Pizzaria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public Pizzaria() {
        clientes = new ArrayList<Cliente>();

    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void imprimirPizzas() {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println("Pizza: " + pizzas.get(i).getNome());
            System.out.println("Ingredientes:");
            pizzas.get(i).imprimirIngredientes();
        }
    }
}
