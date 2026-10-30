package org.example.app;
import org.example.nivel1.cardapio.ComBaconExtra;
import org.example.nivel1.cardapio.ComCheddar;
import org.example.nivel1.pedido.Pedido;
import org.example.nivel1.cardapio.Lanche;
import org.example.nivel1.cardapio.ItemCardapio;
import java.util.Collection;
//O Main deve ficar responsável por iniciar o sistema
// e controlar o fluxo principal.
// Ele não deve usar System.out.println()
// para exibir mensagens nem Scanner para ler dados diretamente.
// Essa interação fica no MenuConsole.
public class Main {
    public static void main(String[] args) {
        int opcao = -1;

        MenuConsole menuConsole = new MenuConsole();
        RestauranteFacade restauranteFacade = new RestauranteFacade();

        while (opcao != 0) {
            opcao = menuConsole.lerOpcao();
            //  REVISAR ESSE CÓDIGO INTEIRO - fiz com muita ajuda do chat-
            switch (opcao) {
                case 1:{
                  String nomeCliente =  menuConsole.lerNomeCliente();
                  Pedido pedido = restauranteFacade.criarPedido(nomeCliente);

                  boolean adicionarMais = true;

                  while(adicionarMais){
                      int opcaoLanche = menuConsole.lerOpcaoLanche();
                      ItemCardapio lanche = restauranteFacade.criarLanche(opcaoLanche);

                      int opcaoAdicional = menuConsole.lerOpcaoAdicional();
                      if(opcaoAdicional == 1) {
                          lanche = new ComCheddar(lanche);
                      }
                      int outroAdicional = menuConsole.lerOpcaoAdicional();
                      if(outroAdicional == 2) {
                          lanche = new ComBaconExtra(lanche);
                      }

                      restauranteFacade.adicionarLanche(pedido, lanche);

                      adicionarMais = menuConsole.perguntarSeDesejaAdicionarMais();
                  }
                  break;
                }
                case 2:
                    Collection<Pedido> pedidos = restauranteFacade.listarPedidos();
                   menuConsole.exibirPedidos(pedidos);
                    break;

                case 3:
                    double total = restauranteFacade.calcularTotalDoDia();
                   menuConsole.exibirFechamentoDoDia(total);
                  break;

                case 0:
                    break;

                default:
                    menuConsole.mensagemInvalida();
            }

        }
    }
}
