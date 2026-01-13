package NivelIntermediario.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        /*
        * Listas não são estáticas
        * Podemos alterar o tamanho dela
        * */

        List<String> teste = new ArrayList<>();

        teste.add("Pimba");
        teste.add("Xunda");

        System.out.println(teste);

        teste.set(0, "xunda");

        teste.remove("xunda");

        System.out.println(teste);

        System.out.println(teste.size());

    }

}
