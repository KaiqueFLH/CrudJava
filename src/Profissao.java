public class Profissao {

    int id;
    String nomeProfissao;
    double salario;
    String instituicaoQueTrabalha;
    static int cont=0;

    public Profissao(String nomeProfissao, double salario, String instituicaoQueTrabalha) {
        this.nomeProfissao = nomeProfissao;
        this.salario = salario;
        this.instituicaoQueTrabalha = instituicaoQueTrabalha;
        this.id = cont;
        cont++;
    }
}
