package nivelBasico.condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: Sao maneiras de reduzir o codigo
        * exemplo-> variavel = (condição)? valorSeVerdadeiro : valorSeFalso;
        * */

        short idade = 18;

        String status = (idade>=18) ? "O caba ja pode ser preso" : "O caba é de menor";

        System.out.println(status);

    }
}
