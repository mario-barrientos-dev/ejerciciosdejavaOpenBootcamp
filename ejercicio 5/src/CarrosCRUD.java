import java.util.ArrayList;
import java.util.List;
public class CarrosCRUD {
    List<Carros> carros = new ArrayList<>();
    public void safe(Carros carro){carros.add(carro);}
    public List<Carros> findAll(){
        return carros;
    }
}
