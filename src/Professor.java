public class Professor extends Profissao {
    String disciplina;
    int quantidadeTurmas;

    public Professor(String nomeProfissao, double salario, String instituicaoQueTrabalha, String disciplina, int quantidadeTurmas) {
        super(nomeProfissao, salario, instituicaoQueTrabalha);
        this.disciplina = disciplina;
        this.quantidadeTurmas = quantidadeTurmas;
    }
}
