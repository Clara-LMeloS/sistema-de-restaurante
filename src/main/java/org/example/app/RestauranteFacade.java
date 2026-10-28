package org.example.app;

import org.example.nivel1.cardapio.Lanche;
import org.example.nivel1.pedido.GerenciadorPedidos;
import org.example.nivel1.pedido.Pedido;
import java.util.Collection;


public class RestauranteFacade {
    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();

    public Pedido criarPedido(String nomeCliente) {
        return gerenciadorPedidos.criarPedido(nomeCliente);
    }

    public void adicionarLanche(Pedido pedido, Lanche lanche) {
        pedido.adicionarItem(lanche);
    }

    public Collection<Pedido> listarPedidos() {
        return gerenciadorPedidos.getPedidos();
    }

    public double calcularTotalDoDia(){
       return gerenciadorPedidos.calcularTotalDoDia();
    }

public Lanche criarLanche(int opcao){

switch (opcao){
    case 1:
        Lanche lanche1 = new Lanche("X-Burguer", 16.00);
        return lanche1;
    case 2:
         Lanche lanche2 = new Lanche("X-Salada", 18.00);
         return lanche2;
    case 3:
        Lanche lanche3 = new Lanche("X-Bacon", 22.00);
        return lanche3;

    default:
        throw new IllegalArgumentException("Opção de lanche inválida!");
        }

    }

}
