package NivelIntermediario.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        * Collections é uma interface que é implementada pelas estruturas de dados
        * 1.List -> ArrayList, LinkedList, Stack
        * 2.Queue -> PriorityQueue
        * 3.Set -> HashSet, LinkedHashSet
        * 3.1.SortedSet -> TreeSet
        *
        * A interface collection ja tem o toString sobrescrito para mostrar os valores das estruturas de dado
        * Todas classes que herdam ou implementam ela ja tem esse metodo por padrão
        * */

        //LinkedList exemplo BASICO
        LinkedList<String> list = new LinkedList<>();

        list.add("Naruto");
        list.add("Kakashi");
        list.add("Sasuke");

        System.out.println(list);

        list.add(1,"Goku");

        System.out.println(list);

        //ArrayList exemplo BASICO
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Goku");
        list1.add("Vegeta");
        list1.add("Gohan");

        //Queue exemplo BASICO
        Queue<String> queue = new LinkedList<>();
        queue.add("Seiya");
        queue.add("Shun");

        queue.poll();
        System.out.println(queue);

        //Stack exemplo BASICO
        Stack<String> stack = new Stack<>();

        stack.push("GOku");
        stack.push("Kuririn");

        stack.pop();

        System.out.println(stack);






        
    }
}
