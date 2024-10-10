import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SistemaAquisicoes {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private Usuario usuarioAtual;

    public void iniciar() {
        inicializarDados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    escolherUsuario(scanner);
                    break;
                case 2:
                    registrarPedido(scanner);
                    break;
                case 3:
                    listarPedidos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n--- Sistema de Aquisições ---");
        System.out.println("Usuário atual: " + (usuarioAtual != null ? usuarioAtual.getNome() : "Nenhum"));
        System.out.println("1. Escolher usuário");
        System.out.println("2. Registrar pedido");
        System.out.println("3. Listar pedidos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
//teste
    public void inicializarDados() {
        departamentos.add(new Departamento("Financeiro", 10000));
        departamentos.add(new Departamento("RH", 8000));
        departamentos.add(new Departamento("Engenharia", 15000));
        departamentos.add(new Departamento("Manutenção", 5000));
        departamentos.add(new Departamento("Vendas", 7000));

        usuarios.add(new Usuario("1", "João Silva", "JS", true));
        usuarios.add(new Usuario("2", "Maria Souza", "MS", false));
        usuarios.add(new Usuario("3", "Carlos Santos", "CS", false));
        usuarios.add(new Usuario("4", "Ana Lima", "AL", true));
        usuarios.add(new Usuario("5", "Paulo Henrique", "PH", false));

        usuarioAtual = usuarios.get(0);
    }

    private void escolherUsuario(Scanner scanner) {
        System.out.println("\nEscolha um usuário:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i));
        }
        System.out.print("Digite o número do usuário: ");
        int escolha = scanner.nextInt();
        if (escolha > 0 && escolha <= usuarios.size()) {
            usuarioAtual = usuarios.get(escolha - 1);
            System.out.println("Usuário atual: " + usuarioAtual.getNome());
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private void registrarPedido(Scanner scanner) {
        if (usuarioAtual == null || usuarioAtual.isAdmin()) {
            System.out.println("Somente funcionários podem registrar pedidos.");
            return;
        }

        System.out.println("\nRegistrar novo pedido para o usuário " + usuarioAtual.getNome());

        Pedido pedido = new Pedido(usuarioAtual, departamentos.get(0), new Date());

        while (true) {
            System.out.print("Descrição do item: ");
            String descricao = scanner.nextLine();
            System.out.print("Valor unitário do item: ");
            double valorUnitario = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            pedido.adicionarItem(new Item(descricao, valorUnitario, quantidade));

            System.out.print("Deseja adicionar mais itens? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        double total = pedido.calcularTotalPedido();
        if (total > pedido.getDepartamento().getLimiteMaximo()) {
            System.out.println("O total do pedido excede o limite permitido pelo departamento.");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido registrado com sucesso.");
        }
    }

    private void listarPedidos() {
        System.out.println("\n--- Pedidos Registrados ---");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
