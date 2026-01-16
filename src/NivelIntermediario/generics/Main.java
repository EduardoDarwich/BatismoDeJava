package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Equipamento1 equipamento1 = new Equipamento1("shuriken");
        Equipamento1 equipamento12 = new Equipamento1("Espada");
        Equipamento2 equipamento2 = new Equipamento2("kunai");
        Equipamento2 equipamento21 = new Equipamento2("Pergaminho");

        Mochila<Object> mochila = new Mochila<>();

        mochila.adicionarFerramenta(equipamento1);
        mochila.adicionarFerramenta(equipamento2);

        mochila.adicionarFerramenta(equipamento12);
        mochila.adicionarFerramenta(equipamento21);

        System.out.println(mochila);


    }
}
