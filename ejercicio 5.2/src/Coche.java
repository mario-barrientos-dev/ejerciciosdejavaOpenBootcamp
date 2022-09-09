public class Coche {
    String modelo;
    String fabricante;
    int añoModelo;

    public Coche() {}

    public Coche(String modelo, String fabricante, int añoModelo) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.añoModelo = añoModelo;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", añoModelo=" + añoModelo +
                '}';
    }
}
