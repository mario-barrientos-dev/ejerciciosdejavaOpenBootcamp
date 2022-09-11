import java.util.ArrayList;

public class recArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 11; i++) {
            list.add(i);
            System.out.println("La lista quedo: " + list);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                System.out.println("La lista quedo: " + list);
            }
        }
    }


}

