import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLink {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ana");
        list.add("pedro");
        list.add("sofia");
        list.add("mario");
        list.add("Johanna");
        list.add("teresa");

        LinkedList<String> list2 = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            list2.add(i, list.get(i));
        }
        System.out.println("Lista de arrayList");
        for (String lista: list) {
            System.out.println(lista);
        }
        System.out.println("Lista de LinkedList");
        for (String lista: list2){
            System.out.println(lista);
        }

    }
}
