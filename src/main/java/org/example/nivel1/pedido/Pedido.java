package org.example.nivel1.pedido;
import org.example.nivel1.cardapio.Lanche;
import java.util.ArrayList;

public class Pedido {

    int identificador;
    String nomeCliente;

    //importei minha classe Lanche ao criar o Array
    ArrayList<Lanche> itens = new ArrayList<>();

    //Lanche é minha classe e lanche é minha variável (que está representando o novo objeto criado dentro do metodo!)
     void adicionarItem(Lanche lanche){
       itens.add(lanche);
    }
    ArrayList<Lanche> getItens(){
         //vou estar retornar minha lista inteira, não só 1 lanche em especifico
         return itens;
    }

    double calcularTotal(){
         double total = 0;
         for (Lanche lanche : itens) {
         }
    return  itens.size();
    }

}
