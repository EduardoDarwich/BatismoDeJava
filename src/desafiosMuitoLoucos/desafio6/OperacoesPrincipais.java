package desafiosMuitoLoucos.desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class OperacoesPrincipais {
    Scanner sc = new Scanner(System.in);

    public Ninja cadastrar(String nome, int idade, Vilas vilas){
        Ninja ninja = new Ninja(vilas,idade, nome);
        System.out.println("Seu ninja foi criado com sucesso");

        return ninja;

    }

    public void listarNinjas(LinkedList<Ninja> ninjas, Menu menu){

        menu.controle = 0;
        for(Ninja ninja: ninjas){

            System.out.println(menu.controle + ". " + ninja.getNome() );
            menu.controle++;

        }

    }

    public void mostrarNinjaEspecifico(LinkedList<Ninja> ninjas, Menu menu){
        System.out.print("Digite o numero do ninja que você quer ver as informações: ");
        menu.ninjaUnico = sc.nextInt();

        while (menu.ninjaUnico <= 0 || menu.ninjaUnico> ninjas.size() ){
            System.out.print("Você digitou um número fora da lista digite novamente um número válido:  ");
            menu.ninjaUnico = sc.nextInt();
        }
        System.out.println(ninjas.get(menu.ninjaUnico - 1));
    }

    public void deletarNinja(LinkedList<Ninja> ninjas, Menu menu){
        System.out.print("Digite o numero do ninja que você quer deletar ");
        menu.ninjaUnico = sc.nextInt();

        while (menu.ninjaUnico <= 0 || menu.ninjaUnico> ninjas.size() ){
            System.out.print("Você digitou um número fora da lista digite novamente um número válido:  ");
            menu.ninjaUnico = sc.nextInt();
        }
        System.out.println("O ninja " + ninjas.remove(menu.ninjaUnico - 1).getNome()+ " foi removido");
    }

    public void retirarPrimeiroNinja(LinkedList<Ninja> ninjas){
        System.out.println(ninjas.pop().getNome() + " foi retirado da lista");

    }

    public void ordemAlfabeticaNome(LinkedList<Ninja> ninjas){
        ninjas.sort(Comparator.comparing(Ninja::getNome));
        System.out.println("Sua lista foi reordenada");

    }

    public void ordenarPelaVila(LinkedList<Ninja> ninjas, Menu menu){
        switch (menu.escolherVila()){
            case 1:
                for (int i = 0; i < ninjas.size() ; i++) {

                    if(ninjas.get(i).getVila().name().equals("KONOHA")){

                        ninjas.addFirst(ninjas.remove(i));

                    }

                }
                System.out.println("Sua fila foi reorganizada");
                break;

            case 2:
                for (int i = 0; i < ninjas.size() ; i++) {

                    if(ninjas.get(i).getVila().name().equals("KIRI")){

                        ninjas.addFirst(ninjas.remove(i));

                    }

                }

                System.out.println("Sua fila foi reorganizada");
                break;

            case 3:
                for (int i = 0; i < ninjas.size() ; i++) {

                    if(ninjas.get(i).getVila().name().equals("IWA")){

                        ninjas.addFirst(ninjas.remove(i));

                    }

                }
                System.out.println("Sua fila foi reorganizada");
                break;

            case 4:
                for (int i = 0; i < ninjas.size() ; i++) {

                    if(ninjas.get(i).getVila().name().equals("SUNA")){

                        ninjas.addFirst(ninjas.remove(i));

                    }

                }
                System.out.println("Sua fila foi reorganizada");
                break;


        }
    }

    public void ordenarPorIdade(LinkedList<Ninja> ninjas){
        ninjas.sort(Comparator.comparingInt(Ninja::getIdade));
        System.out.println("Sua lista foi atualizada");

    }

    public void procurarNinjaPorNome(LinkedList<Ninja> ninjas, Menu menu){
        System.out.print("Digite o nome do ninja que você quer procurar: ");
        menu.nome = sc.nextLine().toLowerCase();

        for(Ninja ninja: ninjas){
            if (ninja.getNome().equals(menu.nome)){
                System.out.println(ninja);
                return;
            }
        }

        System.out.println("O ninja não foi encontrado");



    }
}
