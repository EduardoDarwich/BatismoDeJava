package desafiosMuitoLoucos.desafio1;

public class Desafio1 {
    public static void main(String[] args) {
        //Declarando primeiro ninja
        String nome1 = "Naruto";
        int idade1 = 16;
        String missao1 = "Matar o madara";
        char nivel1 ='S';
        boolean status1 = true;

        //Condição geral para todos os ninjas
        if(idade1 < 15 && (nivel1 == 'S' || nivel1 =='A' || nivel1 =='B')){
            System.out.println("Você não tem idade pra concluir essa missão");

        } else if (status1 == true) {
            System.out.println("você já concluiu essa missão anteriormente");

        } else{
            status1 =true;
            System.out.println("Voce concluiu essa missão");
        }

        //Declarando o segundo ninja
        String nome2 = "konohamaru";
        int idade2 = 14;
        String missao2 = "derrotar o naruto";
        char nivel2 ='B';
        boolean status2 = false;

        //Condição geral para todos os ninjas
        if(idade2 < 15 && (nivel2 == 'S' || nivel2 =='A' || nivel2 =='B')){
            System.out.println("Você não tem idade pra concluir essa missão");

        } else if (status2 == true) {
            System.out.println("você já concluiu essa missão anteriormente");

        } else{
            status2 =true;
            System.out.println("Voce concluiu essa missão");
        }

        //Declarando o terceiro ninja
        String nome3 = "Jiraya";
        int idade3 = 50;
        String missao3 = "Descobrir o segredo do pain";
        char nivel3 ='A';
        boolean status3 = true;

        //Condição geral para todos os ninjas
        if(idade3 < 15 && (nivel3 == 'S' || nivel3 =='A' || nivel3 =='B')){
            System.out.println("Você não tem idade pra concluir essa missão");

        } else if (status3 == true) {
            System.out.println("você já concluiu essa missão anteriormente");

        } else{
            status3 =true;
            System.out.println("Voce concluiu essa missão");
        }



    }
}
