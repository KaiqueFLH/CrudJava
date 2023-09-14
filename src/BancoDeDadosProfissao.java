import java.util.ArrayList;

public class BancoDeDadosProfissao implements ICrud<Integer,Profissao>{

    private ArrayList<Profissao> profissoes = new ArrayList<>();

    public ArrayList<Profissao> getProfissoes() {
        return profissoes;
    }

    @Override
    public Profissao create(Profissao element) {
        return null;
    }

    @Override
    public Profissao readId(Integer integer) {
        return profissoes.get(integer);
    }

    @Override
    public ArrayList<Profissao> readAll() {
        return null;
    }

    @Override
    public Profissao update() {
        return null;
    }

    @Override
    public Profissao delete(Integer integer) {
        profissoes.remove(profissoes.get(integer).id);
        return null;

    }
}
