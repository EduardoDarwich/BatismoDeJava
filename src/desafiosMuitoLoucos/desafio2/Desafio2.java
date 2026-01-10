package desafiosMuitoLoucos.desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        //Iniciando o array
        String[] ninjas = new String[10];

        //Variável para controlar a ação do usuário dentro do cadastro
        int cd = 0;

        //Variável para fazer o controle do tamanho do array e do indice atual dentro do loop
        int indice = 0;

        int tamanho = 0;

        int dl = 0;

        //Iniciando o scanner
        Scanner sc = new Scanner(System.in);

        //Variável de controle para o menu inical
        int op = 0;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            String entrada = sc.nextLine();

            //Controle do menu inicial
            switch (op) {
                case 1:
                    //Loop para o cadastro de ninjas
                    for (int i = 0; i <= ninjas.length; i++) {
                        //Verificação para saber se a vila ainda tem espaços para novos ninjas
                        if (tamanho - ninjas.length == 0) {
                            System.out.println("A aldeia está sem vagas no momento, se você nasceu agora me desculpe");
                            break;
                        }
                        //Recebendo o nome do ninja cadastrado
                        System.out.println("\nvocê ainda pode cadastrar " + (ninjas.length - tamanho) + " ninjas.");
                        System.out.print("Informe o nome do ninja cadastrado: ");
                        ninjas[indice] = sc.nextLine();

                        //Incrementando o indice
                        indice++;

                        //incrementando o tamanho
                        tamanho++;

                        //Menu dentro do loop
                        System.out.println("\n1. Cadastrar mais um ninja");
                        System.out.println("2. Voltar ao menu");
                        System.out.print("escolha uma opção: ");
                        cd = sc.nextInt();

                        //Controle do menu interno
                        if (cd != 2 && cd != 1) {
                            System.out.print("Você escolheu um comando inválido");
                            break;
                        } else if (cd == 2) {
                            break;
                        }

                        //Limpando o buffer
                        entrada = sc.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n=====Listas de ninjas cadastrados =====");

                    if(indice == 0){
                        System.out.println("sem ninjas cadastrados");
                    }
                    //loop para listar os ninjas
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            continue;
                        }
                        System.out.println(i + 1 + ". " + ninjas[i]);
                    }
                    break;

                case 3:
                    if(indice == 0){
                        System.out.println("sem ninjas cadastrados");
                        break;
                    }
                    //loop para listar os ninjas
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            continue;
                        }
                        System.out.println(i + 1 + ". " + ninjas[i]);
                    }
                    System.out.print("Selecione o numero do ninja que você quer deletar: ");
                    dl = sc.nextInt();
                    ninjas[dl - 1] = null;
                    tamanho = tamanho - 1;
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("opção inválida");
            }



            //Condição de parada do loop principal
        } while (op != 4);

        //Fechando o Scanner
        sc.close();
    }
}
