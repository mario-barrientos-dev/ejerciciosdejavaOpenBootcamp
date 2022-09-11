import java.util.Vector;

public class vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(6);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        Vector<Integer> vector2 = new Vector(6);
        vector2.add(2);
        vector2.add(4);
        vector2.add(6);
        vector2.add(8);
        vector2.add(10);
        vector2.add(12);

        System.out.println("Datos del vector1: " + vector);

        for(int i = 0; i < vector.size(); i++){
            for (int j = 0; j < vector2.size(); j++){
                if(vector.get(i)==vector2.get(j)){
                    System.out.println("El valor " + vector.get(i) + " en la posicion " + i + " es igual a " + vector2.get(j) +
                            " en la position " + j);
                }
            }
        }
    }
}