package nivelBasico.condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - condições
        * else if
        * Objetivo: Passar o ninja de niveel de acordo com o numero de missoes*/

        String nome = "Naruto Uzumaki";
        int idade = 15;
        boolean hokage = false;
        int numeroDeMissoes = 6;

        if(numeroDeMissoes > 10 ){
            System.out.println("Voce passou");;
        } else if(numeroDeMissoes > 5) {
            System.out.println("tente de novo depois");
        } else {
            System.out.println("AI TU REPROVOU MTO ");
        }
    }
}
