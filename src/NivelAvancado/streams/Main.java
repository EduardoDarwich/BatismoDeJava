package NivelAvancado.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * Streams é uma forma de diminuir código
        * a forma de usar é .stream*/

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("naruto", "konoha", 17));
        ninjas.add(new Ninja("sasuke", "konoha", 32));
        ninjas.add(new Ninja("sakura", "konoha", 21));
        ninjas.add(new Ninja("kakashi", "konoha", 34));
        ninjas.add(new Ninja("gaara", "suna", 21));
        ninjas.add(new Ninja("temari", "suna", 34));

        //Exemplo de filtragem com stream
        /*ninjas.stream()
                .filter(ninja -> ninja.getVila()
                .equals("suna"))
                .forEach(System.out::println);//printar cada item da lista*/


        //Exemplo de ordenação de listas
/*        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);*/

        //MAP - usado para mapear um atributo especifico da classe
        /*ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);*/

        //Filtrar pelo maior valor
         /*Ninja ninja = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println(ninja);*/
    }

}
