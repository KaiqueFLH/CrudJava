import java.util.ArrayList;

public class BancoDeDadosProfissao implements ICrud<Integer,Profissao>{

    private ArrayList<Profissao> profissoes = new ArrayList<>();

    public ArrayList<Profissao> getProfissoes() {
        return profissoes;
    }

    @Override
    public Profissao create(Profissao profissao) {
        profissoes.add(profissao);
        return profissao;
    }

    @Override
    public Profissao readId(Integer integer) {
        return profissoes.get(integer);
    }

    @Override
    public ArrayList<Profissao> readAll() {
        return profissoes;
    }

    @Override
    public Profissao update(Profissao profissaoNova,Integer idAntigo) {
        profissaoNova.setId(idAntigo);
        profissoes.set(idAntigo,profissaoNova);
        return profissaoNova;
    }

    @Override
    public Profissao delete(Integer integer) {
        profissoes.remove(profissoes.get(integer).getId());
        return null;

    }
}
