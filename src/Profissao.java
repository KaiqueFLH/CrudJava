public class Profissao {

    private int id;
    private String nomeProfissao;
    private double salario;
    private String instituicaoQueTrabalha;
    private static int cont=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profissao(String nomeProfissao, double salario, String instituicaoQueTrabalha) {
        this.nomeProfissao = nomeProfissao;
        this.salario = salario;
        this.instituicaoQueTrabalha = instituicaoQueTrabalha;
        this.id = cont;
        cont++;
    }

    @Override
    public String toString() {
        return "Profissao{" +
                "id=" + id +
                ", nomeProfissao='" + nomeProfissao + '\'' +
                ", salario=" + salario +
                ", instituicaoQueTrabalha='" + instituicaoQueTrabalha + '\'';
    }
}
