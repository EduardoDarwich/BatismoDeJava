package desafiosMuitoLoucos.desafio6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Objetos de controle do menu
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        OperacoesPrincipais operacoesPrincipais = new OperacoesPrincipais();


        //Iniciando os sete primeiros ninjas
        Ninja ninja1 = new Ninja(Vilas.KONOHA, 13, "nonohamaru");
        Ninja ninja2 = new Ninja(Vilas.IWA, 67, "oonoki");
        Ninja ninja3 = new Ninja(Vilas.KIRI, 29, "mei");
        Ninja ninja4 = new Ninja(Vilas.SUNA, 18, "gaara");
        Ninja ninja5 = new Ninja(Vilas.KONOHA, 18, "naruto");
        Ninja ninja6 = new Ninja(Vilas.IWA, 45, "mu");
        Ninja ninja7 = new Ninja(Vilas.KIRI, 30, "zabuza");

        //Adicionando os ninjas a lista a lista
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(ninja1);
        ninjas.add(ninja2);
        ninjas.add(ninja3);
        ninjas.add(ninja4);
        ninjas.add(ninja5);
        ninjas.add(ninja6);
        ninjas.add(ninja7);

        ninjas.sort(Comparator.comparing(Ninja::getNome));

        //Loop principal
        while (menu.op != 7){

            menu.menuPrincipal();

            switch (menu.op){
                case 1 :
                    menu.informarNome();

                    menu.informarIdade();

                    //Menu interno do cadastro para separar as vilas
                    switch (menu.escolherVila()){
                        case 1:
                            ninjas.add(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.KONOHA));
                            break;

                        case 2 :
                            ninjas.add(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.KIRI));
                            break;

                        case 3 :
                            ninjas.add(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.IWA));
                            break;

                        case 4 :
                            ninjas.add(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.SUNA));
                            break;

                        default:
                            menu.numeroInvalido();
                            break;

                    }

                    break;

                case 2 :
                    menu.controle = 1;

                    operacoesPrincipais.listarNinjas(ninjas,menu);

                    menu.menuIntermediarioLista();
                    //Menu interno da listagem para deletar e mostrar informações
                    switch (menu.op){
                        case 1:

                            operacoesPrincipais.mostrarNinjaEspecifico(ninjas, menu);
                            break;

                        case 2:

                            operacoesPrincipais.deletarNinja(ninjas,menu);

                            break;

                        case 3:
                            menu.sair();
                            break;

                        default:
                            menu.numeroInvalido();
                            break;

                    }

                    break;

                case 3:
                    operacoesPrincipais.retirarPrimeiroNinja(ninjas);
                    break;

                case 4:
                    menu.informarNome();
                    menu.informarIdade();


                    //Menu interno do cadastro para separar as vilas
                    switch (menu.escolherVila()){
                        case 1:
                            ninjas.push(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.KONOHA));
                            break;

                        case 2 :
                            ninjas.push(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.KIRI));
                            break;
                        case 3 :
                            ninjas.push(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.IWA));
                            break;
                        case 4 :
                            ninjas.push(operacoesPrincipais.cadastrar(menu.nome, menu.idade, Vilas.SUNA));
                            break;

                        default:
                            menu.numeroInvalido();
                            break;

                    }
                    break;

                case 5:
                    switch (menu.formasDeOrganizarLista()){
                        case 1:
                            operacoesPrincipais.ordemAlfabeticaNome(ninjas);
                            break;

                        case 2:

                            operacoesPrincipais.ordenarPelaVila(ninjas,menu);
                            break;

                        case 3:
                            operacoesPrincipais.ordenarPorIdade(ninjas);
                            break;
                    }

                    break;

                case 6:
                    operacoesPrincipais.procurarNinjaPorNome(ninjas, menu);

                    break;

                case 7:
                    menu.sair();
                    break;

                default:
                    menu.numeroInvalido();

            }
        }

        sc.close();

    }

}
