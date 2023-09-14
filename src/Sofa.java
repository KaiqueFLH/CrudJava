public class Sofa extends Movel {
    int quantidadeLugares;
    boolean temApoioDeBraco;

    public Sofa(double comprimentoEmCm, double preco, String material, int quantidadeLugares) {
        super(comprimentoEmCm, preco, material);
        this.quantidadeLugares = quantidadeLugares;
        this.temApoioDeBraco = true;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "id=" + id +
                ", comprimentoEmCm=" + comprimentoEmCm +
                ", preco=" + preco +
                ", material='" + material + '\'' +
                ", quantidadeLugares=" + quantidadeLugares +
                ", temApoioDeBraco=" + temApoioDeBraco +
                '}';
    }
}
