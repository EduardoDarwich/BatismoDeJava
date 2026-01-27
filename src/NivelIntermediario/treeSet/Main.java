package NivelIntermediario.treeSet;

import java.util.*;

public class Main {


    public static void main(String[] args){




        /*
        TreeSet é um hashSet ordenado
        Usado quando queremos ordem logica em um hashSet
        * String - Ordem alfabetica
        * int - Ordem numérica
        * */

        /*
        * LinkedHashSet é o hashSet porem ele mantem a ordem de inserção*/

        Set<String> ninjaSet = new HashSet<>();

        ninjaSet.add("Goku");
        ninjaSet.add("Goku");
        ninjaSet.add("Vegeta");
        ninjaSet.add("Kuririn");

        System.out.println(ninjaSet);


        //Transformando uma lista em um HashSet usando collections
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


        LinkedHashSet<String> strings = new LinkedHashSet<>();
        TreeSet<String> strings1 = new TreeSet<>();
    }
}
