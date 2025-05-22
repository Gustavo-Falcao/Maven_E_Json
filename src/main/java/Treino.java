public class Treino {
    private int idTreino;
    private String inicioTreino;
    private String meioTreino;
    private String finalTreino;
    private Cliente aluno;

    public Treino(int idTreino, String inicioTreino, String meioTreino, String finalTreino, Cliente aluno) {
        this.idTreino = idTreino;
        this.inicioTreino = inicioTreino;
        this.meioTreino = meioTreino;
        this.finalTreino = finalTreino;
        this.aluno = aluno;
    }

    public int getIdTreino() {
        return idTreino;
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

    public Cliente getAluno() {
        return aluno;
    }

    public void mostrarInfoTreino() {
        System.out.println("Id: " + getIdTreino());
        System.out.println("Inicion: " + getInicioTreino());
        System.out.println("Meiio: " + getMeioTreino());
        System.out.println("Final: " + getFinalTreino());
        System.out.println("Aluno");
        getAluno().mostrarInfoCliente();
    }
}
