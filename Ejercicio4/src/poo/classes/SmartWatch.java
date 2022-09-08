package poo.classes;

public class SmartWatch extends SmartDevice{
    Double pulgadas;
    Double version;

    public SmartWatch(String marca, String modelo, String fabricante, Double pulgadas, Double version) {
        super(marca, modelo, fabricante);
        this.pulgadas = pulgadas;
        this.version = version;
    }

    @Override
    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", fabricante=" + fabricante +
                ", pulgadas=" + pulgadas +
                ", version=" + version;
    }
}
