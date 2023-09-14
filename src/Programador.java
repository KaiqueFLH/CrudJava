public class Programador extends Profissao {
    String linguagemFavorita;
    String nivelDesenvolvimento;

    public Programador(String nomeProfissao, double salario, String instituicaoQueTrabalha, String linguagemFavorita, String nivelDesenvolvimento) {
        super(nomeProfissao, salario, instituicaoQueTrabalha);
        this.linguagemFavorita = linguagemFavorita;
        this.nivelDesenvolvimento = nivelDesenvolvimento;
    }
}
