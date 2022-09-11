public class Main {
    public static void main(String[] args) {

        String valor = "Hola soy una cadena de texto";
        var cadenaLen = valor.length();
        System.out.println("La longitud de mi cadena es : " + cadenaLen);

        var cadnaMayus = valor.toUpperCase();
        System.out.println("La cadena ahora es: "+cadnaMayus);

        var mincadenada= valor.toLowerCase();
        System.out.println("La cadena nueva es : " + mincadenada);

        boolean resultado = valor.startsWith("Hol");
        if(resultado==true){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        };

        boolean resultadoFin = valor.endsWith("o");
        if(resultado==true){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        };

        char letra = valor.charAt(0);
        System.out.println("caracter es: "+letra);
//voltear String, iterar letra por letra
        for (int i = valor.length()-1; i > 0; i--) {
            System.out.print(valor.charAt(i));

        }
    }
}