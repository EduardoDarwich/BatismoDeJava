package NivelIntermediario.stackk;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        * stack - é um tipo dado aonde os valores que são colocados são "empilhados"
        * 1. - O ultimo valor adicionado a pilha é o primeiro a ser retirado
        * 2. - Push adiciona um item na lista
        * 3. - Pop retira o ultimo item adicionado na lista e devolve o valor dele
        * 4. - Peek devolve o valor do item que está no topo da pilha
        * 5. - Size devolve a quantidade de itens que tem na pilha
        * */

        Stack<String> stack = new Stack<>();

        stack.push("Goku");
        stack.push("Vegeta");

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.size());




    }
}
