package NivelAvancado.complexidadeDeAlgoritimos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /*
        * Formas de mensurar visualmente o tempo que o algoritimo demora pra ser executado
        * Deixa mais fácil ver o desempenho do algoritimo */

        long inicio = 0;
        long fim = 0;
        long tempo;



        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i<1241241; i++){
            linkedList.add(i);
            arrayList.add(i);
        }



        inicio = System.nanoTime();
        linkedList.remove(50);
        fim = System.nanoTime();

        tempo = fim - inicio;

        //Resposta para o tempo que levou para operação ser executada
        System.out.println("LinkedList " + tempo + "ns");

        inicio = System.nanoTime();
        arrayList.remove(50);

        fim = System.nanoTime();

        tempo = fim - inicio;

        //Resposta para o tempo que levou para operação ser executada
        System.out.println("ArrayList " + tempo + "ns");



    }
}
