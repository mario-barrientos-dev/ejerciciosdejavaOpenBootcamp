import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarrosCRUD carros = new CarrosCRUD();

        Carros toyota = new Carros("Hilux", "toyota", 2022);
        Carros ford = new Carros("Hilux", "toyota", 2022);
        Carros mazda = new Carros("Hilux", "toyota", 2022);

        carros.safe(toyota);
        carros.safe(ford);
        carros.safe(mazda);

        List<Carros> carro = carros.findAll();
        System.out.println(carro);
    }
}