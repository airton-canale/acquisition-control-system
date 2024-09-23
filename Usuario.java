public class Usuario {
    private String id;
    private String nome;
    private String iniciais;
    private boolean isAdmin;

    public Usuario(String id, String nome, String iniciais, boolean isAdmin) {
        this.id = id;
        this.nome = nome;
        this.iniciais = iniciais;
        this.isAdmin = isAdmin;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIniciais() {
        return iniciais;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return nome + " (" + iniciais + ") - " + (isAdmin ? "Admin" : "Funcionário");
    }
}
