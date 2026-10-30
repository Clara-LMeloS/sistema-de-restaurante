package org.example.app;
import org.example.nivel1.cardapio.ItemCardapio;
import org.example.nivel1.cardapio.Lanche;
import org.example.nivel1.pedido.Pedido;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class MenuConsole {
    Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println(" 1 - Registrar novo pedido\n" +
                " 2 - Listar pedidos do dia\n" +
                " 3 - Fechar restaurante\n" +
                " 4 - ModificarPedido\n" +
                " 0 - Sair\n" +
                "------------------------------------");
    }

    public int lerOpcao() {
        exibirMenu();
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public String lerNomeCliente() {
        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        return nomeCliente;
    }

    public int lerOpcaoLanche() {
        System.out.println("1 - X-Burger — R$ 16,00\n" +
                "2 - X-Salada — R$ 18,00\n" +
                "3 - X-Bacon — R$ 22,00\n" +
                "------------------------------------");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }
    public void tirarIngredientes(Lanche lanche){
        int opcao = -1;

        while(opcao != 0){
            System.out.println("Deseja retirar algum ingrediente?\n" +
                    "1 - Queijo\n" +
                    "2 - Cebola\n" +
                    "3 - Tomate\n" +
                    "4 - Alface\n" +
                    "0 - não/sair\n" +
                    "------------------------------------");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 0:
                break;
                case 1:
                lanche.setQueijo(false);
                break;
                case 2:
                lanche.setCebola(false);
                break;
                case 3:
                lanche.setTomate(false);
                break;
                case 4:
                lanche.setAlface(false);
                break;
                default:
                System.out.println("Opção inválida!");
            }
        }

    }
    public int lerOpcaoAdicional() {
        System.out.println("Deseja adicionais?\n" +
                "0 - Sem adicional \n" +
                "1 - Cheddar — R$ 4,00\n" +
                "2 - Bacon extra — R$ 6,00\n" +
                "------------------------------------");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public boolean perguntarSeDesejaAdicionarMais() {
        System.out.println("Deseja adicionar mais um lanche? \n" +
                "1 - Sim \n" +
                "2 - Não\n" +
                "------------------------------------");
        int lerOpcao = sc.nextInt();
        sc.nextLine();
        if (lerOpcao == 1) {
            return true;
        } else {
            return false;
        }
    }
    //mudar o nome de pedido para lanche para evitar confusao
    public int lerNumeroPedido(){
        System.out.println("Informe o numero do Pedido a ser modificado: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();
        return numeroPedido ;

    }
    public void pedidoNaoEncontrado() {
        System.out.println("Pedido não encontrado!");
    }
    public void exibirMenuModificacao() {
        System.out.println("1 - Adicionar lanche\n" +
                "2 - Remover lanche\n" +
                "3 - Cancelar pedido\n" +
                "--------------------------------");
    }
    public int lerOpcaoModificacao() {
        exibirMenuModificacao();
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

   public void exibirItensPedido (Pedido pedido){
        for(int i =0; i< pedido.getItens().size();i++){
            System.out.println( (i + 1) + "  " + pedido.getItens().get(i).getDescricao());

        }
    }
    public int lerNumeroItem(){
        System.out.println("Digite o numero do lanche a ser removido: ");
        return  sc.nextInt();
    }


    public void exibirFechamentoDoDia(double total, HashSet<String> descricao) {
        System.out.println("Fechamento do dia: ");
        System.out.printf("Total obtido do dia: R$ %.2f%n", total);
        System.out.println("Total de combinações diferentes: " + descricao.size());
        for (String item : descricao){
            System.out.println(item);

        }

    }

    public void exibirPedidos(Collection<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido encontrado.");
            return;
        }
        for (Pedido pedidoAtual : pedidos) {
            System.out.println(pedidoAtual.getIdentificador() + " - " + pedidoAtual.getNomeCliente() + " - " + pedidoAtual.calcularTotal());

            for (ItemCardapio lancheAtual : pedidoAtual.getItens()) {
                System.out.printf("%s - R$ %.2f%n", lancheAtual.getDescricao(), lancheAtual.getPreco());
            }

        }

    }
    public void mensagemInvalida() {
        System.out.println("Opção inválida!");
    }
}

