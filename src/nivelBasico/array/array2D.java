package nivelBasico.array;

public class array2D {
    public static void main(String[] args) {

        /*
        *Objetivo - aprender array 2d
        * */

        String[][] array2d = new String[3][3];

        array2d[0][0] = "Konohagakure";
        array2d[0][1] = "Kirigakure";
        array2d[0][2] = "Sunagakure";

        array2d[1][0] = "Naruto";
        array2d[1][1] = "zabuza";
        array2d[1][2] = "gaara";

        array2d[2][0] = "Sasuke";
        array2d[2][1] = "haku";
        array2d[2][2] = "kankuro";

        for (int i = 0; i < array2d.length; i++) {
            System.out.println(array2d[0][i] + " " + array2d[1][i] + " " + array2d[2][i]);

        }

    }
}
