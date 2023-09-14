public class Cama extends Movel {
    boolean estaArrumada;
    int quantidadeTravesseiros;

    public Cama(double comprimentoEmCm, double preco, String material, int quantidadeTravesseiros) {
        super(comprimentoEmCm, preco, material);
        this.estaArrumada = true;
        this.quantidadeTravesseiros = quantidadeTravesseiros;
    }

    @Override
    public String toString() {
        return "Cama{" +
                "estaArrumada=" + estaArrumada +
                ", quantidadeTravesseiros=" + quantidadeTravesseiros +
                ", id=" + id +
                ", comprimentoEmCm=" + comprimentoEmCm +
                ", preco=" + preco +
                ", material='" + material + '\'' +
                '}';
    }
}
