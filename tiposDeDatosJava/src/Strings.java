import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
        String[] nombres = {"Mario", "Maria", "Johanna"};
        for (int i = 0; i < nombres.length; i++) {
            List<String> concatenado = new ArrayList<String>();
            concatenado.add(nombres[i]);
            System.out.println(concatenado);
        }
    }
}