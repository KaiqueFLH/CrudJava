import java.util.ArrayList;

public class Movel {

    int id;
    double comprimentoEmCm;
    double preco;
    String material;
    static int cont=0;

    public Movel(double comprimentoEmCm, double preco, String material) {
        this.comprimentoEmCm = comprimentoEmCm;
        this.preco = preco;
        this.material = material;
        this.id = cont;
        cont++;
    }
}
