import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Usuario solicitante;
    private Departamento departamento;
    private Date dataPedido;
    private Date dataConclusao;
    private String status;
    private ArrayList<Item> itens;

    public Pedido(Usuario solicitante, Departamento departamento, Date dataPedido) {
        this.solicitante = solicitante;
        this.departamento = departamento;
        this.dataPedido = dataPedido;
        this.status = "Aberto";
        this.itens = new ArrayList<>();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (Item item : itens) {
            total += item.getTotalItem();
        }
        return total;
    }

    public boolean podeAprovar() {
        return calcularTotalPedido() <= departamento.getLimiteMaximo();
    }

    public void aprovar() {
        if (podeAprovar()) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }

    public void concluir(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
        this.status = "Concluído";
    }

    @Override
    public String toString() {
        return "Pedido de " + solicitante.getNome() + " - Status: " + status + " - Total: " + calcularTotalPedido();
    }

}
