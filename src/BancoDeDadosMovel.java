import java.util.ArrayList;

public class BancoDeDadosMovel implements ICrud<Integer, Movel>{

    private ArrayList<Movel> moveis = new ArrayList<>();

    public ArrayList<Movel> getMoveis() {
        return moveis;
    }

    @Override
    public Movel create(Movel movel) {
        moveis.add(movel);
        return movel;
    }

    @Override
    public Movel readId(Integer integer) {
        return moveis.get(integer);
    }

    @Override
    public ArrayList<Movel> readAll() {
        return moveis;
    }

    @Override
    public Movel update() {
        return null;
    }

    @Override
    public Movel delete(Integer integer) {
        moveis.remove(moveis.get(integer).id);
        return null;

    }
}
