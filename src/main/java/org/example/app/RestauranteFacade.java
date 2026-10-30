package org.example.app;

import org.example.nivel1.cardapio.ItemCardapio;
import org.example.nivel1.cardapio.Lanche;
import org.example.nivel1.cardapio.LancheFactory;
import org.example.nivel1.pedido.GerenciadorPedidos;
import org.example.nivel1.pedido.Pedido;
import java.util.Collection;
import java.util.HashSet;


public class RestauranteFacade {
    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();

    public Pedido criarPedido(String nomeCliente) {
        return gerenciadorPedidos.criarPedido(nomeCliente);
    }

    public void adicionarLanche(Pedido pedido, ItemCardapio itemCardapio) {
        pedido.adicionarItem(itemCardapio);
    }

    public Collection<Pedido> listarPedidos() {
        return gerenciadorPedidos.getPedidos();
    }

    public Pedido buscarPedido(int numeroPedido) {
        return gerenciadorPedidos.buscarPedido(numeroPedido);
    }
    public void removerPedido(int numeroPedido){
         gerenciadorPedidos.removerPedidoCompleto(numeroPedido);
    }
    public double calcularTotalDoDia(){
       return gerenciadorPedidos.calcularTotalDoDia();
    }
    public HashSet<String> pegarDescricaoItens(){
        return gerenciadorPedidos.descricaoItens();
    }


public Lanche criarLanche(int opcao){

switch (opcao){
    case 1:
        Lanche lanche1 = LancheFactory.xBurger();
        return lanche1;
    case 2:
         Lanche lanche2 = LancheFactory.xSalada();
         return lanche2;
    case 3:
        Lanche lanche3 = LancheFactory.xBacon();
        return lanche3;

    default:
        throw new IllegalArgumentException("Opção de lanche inválida!");
        }

    }

}
