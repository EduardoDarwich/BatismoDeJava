package desafiosMuitoLoucos.desafio6;

import java.util.Scanner;

public class Menu {

    //Variaveis de controle do menu
    String nome;
    int controle ;
    int ninjaUnico;
    int op = 0;
    String entrada = "";
    int idade;
    int vila;

    Scanner sc = new Scanner(System.in);


    public int escolherVila(){

        System.out.println("1. " + Vilas.KONOHA);
        System.out.println("2. " + Vilas.KIRI);
        System.out.println("3. " + Vilas.IWA);
        System.out.println("4. " + Vilas.SUNA);
        System.out.print("Digite o numero da sua vila: ");
        vila = sc.nextInt();
        return vila;

    }

    public int informarIdade(){
        System.out.print("Digite a idade do seu ninja: ");
        idade = sc.nextInt();
        return idade;
    }

    public String informarNome(){
        System.out.print("Digite o nome do seu ninja: ");
        this.nome = sc.nextLine().toLowerCase();
        return nome;
    }

    public int menuPrincipal(){
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Remover o primeiro ninja da lista");
        System.out.println("4. Adicionar um ninja no topo da lista");
        System.out.println("5. Ordenar a lista conforme a preferência");
        System.out.println("6. Buscar o ninja pelo nome");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        op = sc.nextInt();
        entrada = sc.nextLine();

        return op;
    }

    public void menuIntermediarioLista(){
        System.out.println("O que você deseja fazer a seguir? ");
        System.out.println("1. Listar informações especificas de um ninja");
        System.out.println("2. Deletar um ninja especifico da lista");
        System.out.println("3. Voltar ao menu principal");
        System.out.print("Digite a sua escolha: ");
        op = sc.nextInt();

    }

    public int formasDeOrganizarLista(){
        System.out.println("1. Listar por nome(Ordem alfabética)");
        System.out.println("2. Listar pela vila");
        System.out.println("3. Listar por idade");
        System.out.print("escolha sua forma de listar: ");
        op = sc.nextInt();

        return op;

    }

    public void numeroInvalido(){
        System.out.println("Você digitou um numero inválido");
    }

    public void sair(){
        System.out.println("Saindo...");
    }
}
