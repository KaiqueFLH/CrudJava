public class Mesa extends Movel {
    private int quantidadePernas;
    private String formatoMesa;

    public Mesa(double comprimentoEmCm, double preco, String material, int quantidadePernas, String formatoMesa) {
        super(comprimentoEmCm, preco, material);
        this.quantidadePernas = quantidadePernas;
        this.formatoMesa = formatoMesa;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                super.toString() +
                "quantidadePernas=" + quantidadePernas +
                ", formatoMesa='" + formatoMesa + '\'' +
                '}';
    }
}
