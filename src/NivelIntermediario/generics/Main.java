package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static void main(String[] args) {

        Equipamento equipamento = new Equipamento("shuriken");
        Equipamento equipamento1 = new Equipamento("kunai");

        Mochila<Object> mochila = new Mochila<>();

        mochila.adicionarFerramenta(equipamento);
        mochila.adicionarFerramenta(equipamento1);

        System.out.println(mochila);


    }
}
