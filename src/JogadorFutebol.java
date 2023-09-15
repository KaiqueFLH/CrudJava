public class JogadorFutebol extends Profissao {

    String patrocinador;
    int quantidadeGols;

    public JogadorFutebol(String nomeProfissao, double salario, String instituicaoQueTrabalha, String patrocinador, int quantidadeGols) {
        super(nomeProfissao, salario, instituicaoQueTrabalha);
        this.patrocinador = patrocinador;
        this.quantidadeGols = quantidadeGols;
    }

    @Override
    public String toString() {
        return super.toString() +
                "patrocinador='" + patrocinador + '\'' +
                ", quantidadeGols=" + quantidadeGols +
                '}';
    }
}
