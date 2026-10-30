package org.example.nivel1.pedido;
import org.example.nivel1.cardapio.ItemCardapio;
import java.util.ArrayList;

public class Pedido {

    int identificador;
    String nomeCliente;


   private ArrayList<ItemCardapio> itens = new ArrayList<>();

   public void removerItem(int numeroItem){
       if(numeroItem >=1 && numeroItem <= itens.size()){
           itens.remove(numeroItem -1);
       }

   }

    //Lanche é minha classe e lanche é minha variável (que está representando o novo objeto criado dentro do metodo!)
    public void adicionarItem(ItemCardapio itemCardapio) {
       itens.add(itemCardapio);
    }
   public ArrayList<ItemCardapio> getItens(){
         //vou estar retornar minha lista inteira, não só 1 lanche em especifico
         return itens;
    }

   public double calcularTotal(){
         double total = 0;
         //calculei aqui o preço de cada item adicionado a minha lista acessando a posição deles no array
         for (int i =0; i < itens.size(); i++){
             total =  total + itens.get(i).getPreco();
         }
    return total;
    }

    public void setNomeCliente(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException(" O nome não pode ficar em branco!");
        } else {
            this.nomeCliente = nome;
        }

    }
    public Pedido(int identificador, String nomeCliente) {
        this.identificador = identificador;
        setNomeCliente(nomeCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }
}
