public class Professor extends Profissao {
    private String disciplina;
    private int quantidadeTurmas;

    public Professor(String nomeProfissao, double salario, String instituicaoQueTrabalha, String disciplina, int quantidadeTurmas) {
        super(nomeProfissao, salario, instituicaoQueTrabalha);
        this.disciplina = disciplina;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "disciplina='" + disciplina + '\'' +
                ", quantidadeTurmas=" + quantidadeTurmas +
                '}';
    }
}
