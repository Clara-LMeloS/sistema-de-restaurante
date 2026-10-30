package org.example.nivel1.cardapio;

public class ComBaconExtra implements ItemCardapio {
    private ItemCardapio itemCardapio;

    public ItemCardapio getItemCardapio() {
        return itemCardapio;
    }

  public ComBaconExtra(ItemCardapio itemCardapio){
        this.itemCardapio = itemCardapio;

    }
    @Override
    public String getDescricao() {
        return itemCardapio.getDescricao() + "+ bacon extra";
    }

    @Override
    public double getPreco() {
        return itemCardapio.getPreco() + 6.00;
    }
}

