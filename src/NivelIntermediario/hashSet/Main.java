package NivelIntermediario.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        * Usado quando queremos ignorar itens repetidos na lista
        * Não trabalha com index (como uma lista ordenada)
        * Para remover itens é nescessário passar o objeto exato*/

        Set<String> ninjaSet = new HashSet<>();

        ninjaSet.add("Goku");
        ninjaSet.add("Goku");
        ninjaSet.add("Vegeta");
        ninjaSet.add("Kuririn");

        System.out.println(ninjaSet);


        //Transformando uma lista em um HashSet  usando collections
        List<String> ninja = new ArrayList<>();
        ninja.add("Naruto");
        ninja.add("Naruto");
        ninja.add("Sasuke");
        ninja.add("Kuririn");

        Set<String> ninjaSet2 = new HashSet<>();

        ninjaSet2.addAll(ninja);

        System.out.println(ninjaSet2);


        //Removendo um item
        ninjaSet.remove("Kuririn");

        System.out.println(ninjaSet);




    }
}
