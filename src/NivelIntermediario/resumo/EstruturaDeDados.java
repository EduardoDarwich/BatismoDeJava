package NivelIntermediario.resumo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EstruturaDeDados {
    public static void main(String[] args) {

        /*
        * O primeiro indice sempre vai ser 0 e vai seguir uma crescente normal*/

        /*Array
        * 1. São estáticos
        * 2. são objetos de referencia na memória
        * 3. para recuperar um valor de um array é necessário usar um indice*/

        System.out.println("--------------Array-------------");
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";

        //Vai retornar o endereço na memória
        System.out.println("esse é o endereço de memória do array " + ninjas);

        //Vai retornar o valor do indice 0 do array
        System.out.println("esse é o ninja no indice 0 do array " + ninjas[0]);

        /*Lista
        * 1. É dinâmica
        * 2. Funciona de forma parecida com o array
        * 3. Não é necessário definir o tamanho da lista na hora de inicializar ela
        * 4. A lista ja tem o ToString configurado para retornar todos os itens da lista(se um item for um objeto na memória que não tem o ToString ele mostra o caminho)
        * 5. A lista é um pouco mais lenta em comparação com array*/
        System.out.println("--------------Lista-------------");
        List<String> list = new ArrayList<>();

        //Adiciona um item a lista
        list.add("Naruto");
        list.add("Sasuke");
        list.add("Sakura");
        System.out.println(list);

        //Inverte a ordem dos itens da lista
        System.out.println(list.reversed());

        //Remove um item pelo valor dele
        list.remove("Naruto");

        /*Stack
        * 1. Ultimo item a entrar se torna o topo da pilha
        * 2. Funciona parecido com a lista
        * 3. É tratada de forma vertical*/
        System.out.println("--------------Stack-------------");

        Stack<String> stack = new Stack<>();

        //Adiciona um item na pilha
        stack.push("Goku");
        stack.push("Vegeta");

        //Mostra a quantidade de itens na pilha
        System.out.println(stack.size());

        //Mostra o item que está no topo da pilha
        System.out.println(stack.peek());

        //Remove o item que está no topo da pilha e devolve seu valor
        System.out.println(stack.pop());


    }
}
