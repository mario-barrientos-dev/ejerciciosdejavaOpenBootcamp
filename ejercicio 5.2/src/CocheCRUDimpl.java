import java.util.List;

public class CocheCRUDimpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {

    }

    @Override
    public List<Coche> findAll() {
        return null;
    }

    @Override
    public void delete(Coche coche) {

    }
    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUDImpl" +
                " save=" + save +
                ", findAll=" + findAll +
                ", delete=" + delete;
    }
}
