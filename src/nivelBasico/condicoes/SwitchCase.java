package nivelBasico.condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * SwitchCases: Servem para gerar casos especificos
        * Objetivo: pedir pro usuario escolher entre os Ninjas
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        switch (sc.nextInt()){
            case 1:
                System.out.println("Voce escolheu o Naruto");
                break;
            case 2:
                System.out.println("voce escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Voce escolheu a sakura");
                break;
            default:
                System.out.println("burrão");
        }

        //outra forma de usar o switch case
        String personagem = switch (sc.nextInt()){
            case 1 -> "Naurto";
            case 2 -> "Sasuke";
            case 3 -> "Sakura";
            default -> "Desconhecido";

        };

        System.out.println("O seu personagem é " + personagem);




        // fechando o nivelBasico.scanner
        sc.close();
    }
}
