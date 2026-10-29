package org.example.nivel1.cardapio;

//CLASSE ESPECIALISTA EM LANCHES - MINHA FÁBRICA - ela cria os itens do meu cardápio/não é um item do cardapio
public class LancheFactory  {

    public static Lanche xBurger(){
    Lanche lanche = new Lanche( "xBurger", 16.00 );
    return lanche;
    }

    public static Lanche xSalada(){
        Lanche lanche = new Lanche( "xSalada", 18.00 );
        return lanche;
    }

    public static Lanche xBacon(){
        Lanche lanche = new Lanche( "xBacon", 22.00 );
        return lanche;
    }


    }
