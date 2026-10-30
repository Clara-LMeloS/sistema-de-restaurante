package org.example.app;
import org.example.nivel1.cardapio.*;
import org.example.nivel1.pedido.Pedido;
import java.util.Collection;
import java.util.HashSet;
//O Main deve ficar responsável por iniciar o sistema
// e controlar o fluxo principal.
// Ele não deve usar System.out.println()
// para exibir mensagens nem Scanner para ler dados diretamente.
// Essa interação fica no MenuConsole.


//ORGANIZANDO MINHA SEQUENCIA DE AÇOES
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

                      //criando meu novo lanche
                      Lanche novoLanche = restauranteFacade.criarLanche(opcaoLanche);
                      //personalizando o lanche
                      menuConsole.tirarIngredientes(novoLanche);
                      // me permite usar o mesmo lanche pra continuar com os adicionais seguintes!
                      ItemCardapio lanche = novoLanche;


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
                    HashSet<String> descricao = restauranteFacade.pegarDescricaoItens();
                    double total = restauranteFacade.calcularTotalDoDia();
                   menuConsole.exibirFechamentoDoDia(total, descricao);
                  break;

                case 4:
                    menuConsole.exibirPedidos(restauranteFacade.listarPedidos());
                    int numeroPedido = menuConsole.lerNumeroPedido();
                    Pedido pedidoExistente = restauranteFacade.buscarPedido(numeroPedido);

                    if(pedidoExistente == null){
                        menuConsole.pedidoNaoEncontrado();
                    }else{
                        int opcaoModificacao = menuConsole.lerOpcaoModificacao();


                        switch (opcaoModificacao) {
                            case 1:
                                int opcaoLanche = menuConsole.lerOpcaoLanche();
                                Lanche novoLanche = restauranteFacade.criarLanche(opcaoLanche);
                                menuConsole.tirarIngredientes(novoLanche);
                                ItemCardapio lanche = novoLanche;

                                int opcaoAdicional = menuConsole.lerOpcaoAdicional();
                                if (opcaoAdicional == 1) {
                                    lanche = new ComCheddar(lanche);
                                }

                                int outroAdicional = menuConsole.lerOpcaoAdicional();
                                if (outroAdicional == 2) {
                                    lanche = new ComBaconExtra(lanche);
                                }
                                //chamando o metodo que eu criei
                                restauranteFacade.adicionarLanche(pedidoExistente, lanche);
                                break;

                            case 2:
                                menuConsole.exibirItensPedido(pedidoExistente);
                                int lerNumeroPedido = menuConsole.lerNumeroItem();
                                pedidoExistente.removerItem(lerNumeroPedido);
                                break;

                            case 3:
                                restauranteFacade.removerPedido(numeroPedido);
                                break;

                        }
                    }

                case 0:
                    break;

                default:
                    menuConsole.mensagemInvalida();
            }

        }
    }
}
