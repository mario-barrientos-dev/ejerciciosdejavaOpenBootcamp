public class Arrays {

    public static void main(String[] args) {
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for (int i : arrayUno) {
            System.out.println(i);
        }
        String arrayDos[] = {"q","4","1","2","X"};


        for (String i : arrayDos) {
            System.out.println("La letra actual del array es: " + i);
        }

        System.out.println(arrayUno.length);

        for(int i =0; i < arrayUno.length; i++) {
            System.out.println("Recorrido con indice: "+arrayUno[i]+ "en posicion" + i);
        }
        int arraybid[][] = new int[2][3];
        arraybid[0][0] = 1;
        arraybid[0][1] = 20;
        arraybid[0][2] = 3;
        arraybid[1][0] = 40;
        arraybid[1][1] = 5;
        arraybid[1][2] = 6;

        int arraybid2[][] = {
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 },
                { 11, 12, 13, 14, 15, 16, 17, 18, 19,}

        };
        for (int i = 0; i < arraybid2.length; i++) {
            for(int j = 0; j < arraybid2[1].length; j++) {
                System.out.println("Dimension  i =" + i + "Dimension  j ="+ j );
                System.out.println("valores de las dimencions= " + arraybid2[i][j]);
            }
        }
    }


}
