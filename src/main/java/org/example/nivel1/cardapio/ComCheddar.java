package org.example.nivel1.cardapio;


public class ComCheddar implements ItemCardapio{
    private ItemCardapio itemCardapio;

    public ItemCardapio getItemCardapio() {
        return itemCardapio;
    }

  public ComCheddar(ItemCardapio itemCardapio){
     this.itemCardapio = itemCardapio;

   }
        @Override
        public String getDescricao() {
            return itemCardapio.getDescricao() + "+ cheddar ";
        }

        @Override
        public double getPreco() {
            return itemCardapio.getPreco() + 4.00;
        }
    }

