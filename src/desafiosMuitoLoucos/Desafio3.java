package desafiosMuitoLoucos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        class Ninja {
            String nome;
            int idade;
            String missao;
            String nivelDificuldade;
            String statusMissao;

            public void mostrarInformacoes(){
                System.out.println("O nome do ninja é " + nome);
                System.out.println("A idade do ninja é " + idade);
                System.out.println("A missão desse ninja é " + missao);
                System.out.println("O nível de dificuldade dessa missão é " + nivelDificuldade);
                System.out.println("A missão atual está " + statusMissao );
            }
        }

        class Uchiha extends Ninja {
            String habilidadeEspecial;
            public void mostrarHabilidadeEspecial(){
                System.out.println("A habilidade especial do seu ninja é " + habilidadeEspecial);
            }

            @Override
            public void mostrarInformacoes(){
                System.out.println("O nome do ninja é " + nome);
                System.out.println("A idade do ninja é " + idade);
                System.out.println("A missão desse ninja é " + missao);
                System.out.println("O nível de dificuldade dessa missão é " + nivelDificuldade);
                System.out.println("A missão atual está " + statusMissao );
                System.out.println("A habilidade especial do seu ninja é " + habilidadeEspecial);

            }

        }

        List<Ninja> ninjas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int op = 0;
        String entrada = "";
        int uc = 0;
        int at = 0;


        while (op != 4){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Mostrar informações de todos os ninjas");
            System.out.println("2. adicionar novos ninjas");
            System.out.println("3. atualizar habilidades especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();
            entrada = sc.nextLine();


            switch (op){
                case 1:
                    if(ninjas.isEmpty()){
                        System.out.println("Nenhum ninja foi cadastrado ainda");
                    }
                    for (Ninja ninja: ninjas){

                        ninja.mostrarInformacoes();

                        System.out.println("\n");
                    }
                    break;

                case 2:

                    System.out.println("Você deseja registrar um uchiha?");
                    System.out.println("1. Sim");
                    System.out.println("2. Não");
                    System.out.print("Escolha sua opção: ");

                    uc = sc.nextInt();
                    entrada = sc.nextLine();

                    if (uc == 1 ){
                        Uchiha uchiha = new Uchiha();

                        System.out.print("Digite o nome do seu ninja aqui: ");
                        uchiha.nome = sc.nextLine();

                        System.out.print("Digite a idade do seu ninja aqui: ");
                        uchiha.idade = sc.nextInt();
                        entrada = sc.nextLine();

                        System.out.print("Digite a missão do seu ninja aqui: ");
                        uchiha.missao = sc.nextLine();

                        System.out.print("Digite o nível de dificuldade da missão do seu ninja aqui: ");
                        uchiha.nivelDificuldade = sc.nextLine();

                        System.out.print("Digite o status da missão aqui: ");
                        uchiha.statusMissao = sc.nextLine();

                        System.out.print("Digite qual é a habilidade especial do seu ninja: ");
                        uchiha.habilidadeEspecial = sc.nextLine();

                        ninjas.add(uchiha);

                        System.out.println("\nO ninja foi cadastrado com sucesso");
                        break;

                    }
                    Ninja ninja = new Ninja();

                    System.out.print("Digite o nome do seu ninja aqui: ");
                    ninja.nome = sc.nextLine();

                    System.out.print("Digite a idade do seu ninja aqui: ");
                    ninja.idade = sc.nextInt();
                    entrada = sc.nextLine();

                    System.out.print("Digite a missão do seu ninja aqui: ");
                    ninja.missao = sc.nextLine();

                    System.out.print("Digite o nível de dificuldade da missão do seu ninja aqui: ");
                    ninja.nivelDificuldade = sc.nextLine();

                    System.out.print("Digite o status da missão aqui: ");
                    ninja.statusMissao = sc.nextLine();

                    ninjas.add(ninja);

                    System.out.println("\nO ninja foi cadastrado com sucesso");



                    break;

                case 3:
                    if (ninjas.isEmpty()){
                        System.out.println("Não tem ninjas no sistema");
                        break;
                    }
                    for (int i = 0; i < ninjas.toArray().length; i++) {

                        System.out.println((i + 1) + ". " + ninjas.get(i).nome);

                    }

                    System.out.print("escolha o numero de um ninja para alterar a habilidade: ");
                    Uchiha ninjaAt = (Uchiha) ninjas.get(sc.nextInt() - 1);
                    entrada = sc.nextLine();

                    System.out.print("Agora digite a nova habilidade desse ninja: ");
                    ninjaAt.habilidadeEspecial = sc.nextLine();

                    System.out.println("\nHabilidade atualizada");
                    break;

                default:
                    System.out.println("Escolha um numero válido");
                    break;



            }





        }


    }
}
