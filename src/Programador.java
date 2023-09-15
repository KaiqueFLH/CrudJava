public class Programador extends Profissao {
    private String linguagemFavorita;
    private String nivelDesenvolvimento;

    public Programador(String nomeProfissao, double salario, String instituicaoQueTrabalha, String linguagemFavorita, String nivelDesenvolvimento) {
        super(nomeProfissao, salario, instituicaoQueTrabalha);
        this.linguagemFavorita = linguagemFavorita;
        this.nivelDesenvolvimento = nivelDesenvolvimento;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "linguagemFavorita='" + linguagemFavorita + '\'' +
                ", nivelDesenvolvimento='" + nivelDesenvolvimento + '\'' +
                '}';
    }
}
