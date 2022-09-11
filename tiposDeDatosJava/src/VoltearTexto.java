import java.util.Scanner;

public class VoltearTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los textos y/o valores aqui");
        String texto = scanner.nextLine();

        StringBuilder alrever = new StringBuilder(texto);
        texto = alrever.reverse().toString();
        System.out.println(texto);

    }
}
