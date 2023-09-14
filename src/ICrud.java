import java.util.ArrayList;

public interface ICrud<ID, E> {

    E create(E element);

    E readId(ID id);

    ArrayList<E> readAll();

    E update();

    E delete(ID id);


}
