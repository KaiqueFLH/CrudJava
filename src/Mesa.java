public class Mesa extends Movel {
    int quantidadePernas;
    String formatoMesa;

    public Mesa(double comprimentoEmCm, double preco, String material, int quantidadePernas, String formatoMesa) {
        super(comprimentoEmCm, preco, material);
        this.quantidadePernas = quantidadePernas;
        this.formatoMesa = formatoMesa;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "quantidadePernas=" + quantidadePernas +
                ", formatoMesa='" + formatoMesa + '\'' +
                ", id=" + id +
                ", comprimentoEmCm=" + comprimentoEmCm +
                ", preco=" + preco +
                ", material='" + material + '\'' +
                '}';
    }
}
