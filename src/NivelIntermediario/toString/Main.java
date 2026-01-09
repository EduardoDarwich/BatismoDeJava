package NivelIntermediario.toString;

import NivelIntermediario.ennum.Goku;

public class Main {
    public static void main(String[] args) {

        Sayajin goku = new Sayajin();
        goku.nome = "Goku";
        goku.idade = 30;

        Sayajin vegeta = new Sayajin();
        vegeta.nome = "Vegeta";
        vegeta.idade = 36;

        System.out.println(goku);
        System.out.println(vegeta);


    }

}
