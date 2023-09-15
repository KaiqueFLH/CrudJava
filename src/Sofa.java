public class Sofa extends Movel {
    private int quantidadeLugares;
    private boolean temApoioDeBraco;

    public Sofa(double comprimentoEmCm, double preco, String material, int quantidadeLugares) {
        super(comprimentoEmCm, preco, material);
        this.quantidadeLugares = quantidadeLugares;
        this.temApoioDeBraco = true;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                super.toString()+
                ", quantidadeLugares=" + quantidadeLugares +
                ", temApoioDeBraco=" + temApoioDeBraco +
                '}';
    }
}
