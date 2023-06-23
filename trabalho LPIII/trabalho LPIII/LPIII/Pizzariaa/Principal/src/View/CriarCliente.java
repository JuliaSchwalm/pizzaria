package View;

import java.util.Scanner;

import Modelo.Cliente;
import Modelo.Pizzaria;

public class CriarCliente {

    public CriarCliente (Pizzaria pizzaria){
        this.pizzaria  = pizzaria;
      }
  
      private Pizzaria pizzaria;
      Scanner ler = new Scanner (System.in);

      Cliente cliente = new Cliente(); 

    public void novoCliente(){
        System.out.println("Digite o nome para cadastrar:");
        cliente.setNome(ler.next());

        pizzaria.getClientes().add(cliente);
    }
}
