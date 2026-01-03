package nivelBasico.condicoes;

public class LacosRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: vão repetir infinitamente ou até atingir o parametro desejado
        * while && For
        * */

        
        int numeroClone = 0;
        int numeroMaxClone = 30;

        //while
        while (numeroClone < numeroMaxClone){
            numeroClone ++;
            System.out.println("Voce fez o seu clone numero " + numeroClone);
        }

        //for
        for (int i = 0; i <= numeroMaxClone; i++) {

            System.out.println("Voce fez o seu clone numero " + i);

        }

    }
}
