public class Treino {
    private String inicioTreino;
    private String meioTreino;
    private String finalTreino;
    private Cliente cliente;

    public Treino(String inicioTreino, String meioTreino, String finalTreino, Cliente cliente) {
        this.inicioTreino = inicioTreino;
        this.meioTreino = meioTreino;
        this.finalTreino = finalTreino;
        this.cliente = cliente;
    }

    public String getInicioTreino() {
        return inicioTreino;
    }

    public String getMeioTreino() {
        return meioTreino;
    }

    public String getFinalTreino() {
        return finalTreino;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
