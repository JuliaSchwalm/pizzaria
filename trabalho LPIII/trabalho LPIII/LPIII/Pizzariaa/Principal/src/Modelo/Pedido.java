package Modelo;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private Cliente cliente;
    private char tamanhoPizza;
    private Endereco enderecoEntrega;

    public Pedido() {

    }

    public char getTamanhoPizza() {
        return tamanhoPizza;
    }

    public void setTamanhoPizza(char tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

}
