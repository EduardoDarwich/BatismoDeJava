package NivelIntermediario.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        * Filas são parecidas com pilhas
        * 1. O primeiro item a entrar é o primeiro a sair
        * 2. Filas são uma versão de LinkedList
        * 3. Head é o nome do primeiro item da fila
        * 4. Tail é o nome do ultimo item da fila
        * */

        Queue<String> queue = new LinkedList<>();

        //Adiciona um item na fila
        queue.add("Naruto");
        queue.add("Sasuke");
        queue.add("Sakura");
        queue.add("Tobirama");
        queue.add("Hashirama");

        //Mostrar a fila
        System.out.println(queue);

        //Retirar o primeiro item da fila e devolver seu valor
        System.out.println(queue.poll());

        System.out.println(queue);

        //Mostra o primeiro item da fila
        System.out.println(queue.peek());

        //Verificar se a fila está vazia
        System.out.println(queue.isEmpty());


    }
}
