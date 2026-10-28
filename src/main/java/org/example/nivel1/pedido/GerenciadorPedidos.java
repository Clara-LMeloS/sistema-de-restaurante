package org.example.nivel1.pedido;
import java.util.Collection;
import java.util.HashMap;

//É O S DO SOLID -Single Responsability Principle-! Cada classe com sua responsabilidade!
public class GerenciadorPedidos{

    private HashMap<Integer, Pedido> pedidos = new HashMap<>();
    private int contadorPedidos = 1;

    /*
    tenho que criar uma collection para exibir a coleção de pedidos que o ENUNCIADO PEDE!
    getPedidos() — devolve a coleção de pedidos para quem for exibir
    */
    public Collection<Pedido> getPedidos() {
        return pedidos.values();
    }

    //Vou gerar a chave e criar o pedido
    public Pedido criarPedido(String nomeCliente){
        Pedido novo = new Pedido(contadorPedidos, nomeCliente);
        pedidos.put(novo.getIdentificador(), novo);
        contadorPedidos++;
        return novo;
    }
    //Estou procurando/devolvendo a chave do pedido
    public Pedido buscarPedido(int numero) {
        if (pedidos.containsKey(numero)) {
            return pedidos.get(numero);
        } else {
            return null;
        }
    }
    //Revisar essa aqui - to só o pó não sei explicar como fiz
       public double calcularTotalDoDia() {
            //Contando o valor total dos meus pedidos do dia usando o for pra repetir quantos pedidos necessários
            double guardarValores = 0;
            for (Pedido pedidoAtual : pedidos.values()) {
                guardarValores = guardarValores + pedidoAtual.calcularTotal();
            }
            return guardarValores;
        }
   }

