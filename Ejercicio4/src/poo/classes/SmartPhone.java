package poo.classes;

public class SmartPhone extends SmartDevice{
    String red;
    int camaras;

    public SmartPhone(String marca, String modelo, String fabricante, String red, int camaras) {
       super(marca, modelo, fabricante);
       this.red = red;
       this.camaras = camaras;
    }

    @Override
    public String toString() {
        return "marca=" + marca +
                ", modelo=" + modelo +
                ", fabricante=" + fabricante +
                ", red=" + red +
                ", camaras=" + camaras;
    }
}
