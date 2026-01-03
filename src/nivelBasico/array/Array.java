package nivelBasico.array;

public class Array {
    public static void main(String[] args) {

        /*
         * Arrays são tipo referência.
         * */

        String[] teste = new String[5];
        teste[0] = "goku";
        teste[1] = "Vegeta";
        teste[2] = "Gohan";
        teste[3] = "kuririn";


        //Loop para percorre o array
        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i] + " volta numero " + i);
        }


        for (String teste1 : teste) {

            System.out.println(teste1.toUpperCase());

        }



    }
}
