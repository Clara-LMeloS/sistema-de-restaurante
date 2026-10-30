package org.example.app;
import org.example.nivel1.cardapio.ItemCardapio;
import org.example.nivel1.pedido.Pedido;
import java.util.Collection;
import java.util.Scanner;

public class MenuConsole {
    Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println(" 1 - Registrar novo pedido\n" +
                " 2 - Listar pedidos do dia\n" +
                " 3 - Fechar restaurante\n" +
                " 0 - Sair" +
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
                "3 - X-Bacon — R$ 22,00");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }
    public int lerOpcaoAdicional() {
        System.out.println("0 - Sem adicional \n" +
                "1 - Cheddar — R$ 4,00\n" +
                "2 - Bacon extra — R$ 6,00");
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;
    }

    public boolean perguntarSeDesejaAdicionarMais() {
        System.out.println("Deseja adicionar mais um lanche? \n" +
                "1 - Sim \n" +
                "2 - Não");
        int lerOpcao = sc.nextInt();
        sc.nextLine();
        if (lerOpcao == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirFechamentoDoDia(double total) {
        System.out.println("Fechamento do dia: ");
        System.out.printf("Total obtido do dia: R$ %.2f%n", total);

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

