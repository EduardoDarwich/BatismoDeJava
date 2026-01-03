package nivelBasico.scanner;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args){
        /*
        * Scanner = é uma forma do usuário colocar dados na aplicação
        * Objetivo: O usuario vai criar um ninja e vamos validar os dados
        * */

        Scanner sc = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Digite o nome do ninja aqui: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = sc.nextInt();
        System.out.println("A idade do seu ninja é: "+ idadeDoNinja);

        //Sempre fechar o scanner
        sc.close();


    }
}
