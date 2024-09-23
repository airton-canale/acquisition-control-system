public class Departamento {
    private String nome;
    private double limiteMaximo;

    public Departamento(String nome, double limiteMaximo) {
        this.nome = nome;
        this.limiteMaximo = limiteMaximo;
    }

    public String getNome() {
        return nome;
    }

    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    @Override
    public String toString() {
        return nome + " (Limite por pedido: " + limiteMaximo + ")";
    }
}
