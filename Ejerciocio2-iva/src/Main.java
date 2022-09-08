import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String[] args) {

        float a = 9.99f;
        float b = calculoIva(a);
        System.out.println(b);
    }

    static float calculoIva(float a) {
        return(a * 1.19f);
    }
}