import java.util.ArrayList;

public class Movel {

    private int id;
    private double comprimentoEmCm;
    private double preco;
    private String material;
    private static int cont=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getComprimentoEmCm() {
        return comprimentoEmCm;
    }

    public void setComprimentoEmCm(double comprimentoEmCm) {
        this.comprimentoEmCm = comprimentoEmCm;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Movel.cont = cont;
    }

    public Movel(double comprimentoEmCm, double preco, String material) {
        this.comprimentoEmCm = comprimentoEmCm;
        this.preco = preco;
        this.material = material;
        this.id = cont;
        cont++;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", comprimentoEmCm=" + comprimentoEmCm +
                ", preco=" + preco +
                ", material='" + material + '\'';
    }
}
