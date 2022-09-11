import java.util.Vector;

public class Ejerciciovect {

        public static void main(String[] args) {
            Vector<Integer> vector = new Vector();
            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);
            vector.add(5);
            vector.add(6);

            System.out.println("Datos del vector: " + vector);

            vector.remove(1);
            vector.remove(1);
            System.out.println("Datos del vector: " + vector);

            System.out.println("Desperdiciaria demasiada memoria");
        }

    }

