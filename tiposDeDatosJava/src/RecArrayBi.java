public class RecArrayBi {
    public static void main(String[] args) {
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
