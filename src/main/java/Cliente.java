public class Cliente {

    private int idCliente;
    private String nome;
    private String email;
    private int idade;

    public Cliente() {

    }

    public Cliente(int idCliente, String nome, String email, int idade) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public int getIdCliente() {
        return idCliente;
    }
}
