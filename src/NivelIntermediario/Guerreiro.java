package NivelIntermediario;

public class Guerreiro {
    String nome;
    int idade;
    String formaAtual;
    boolean vivo;



    public String verPoderDeLuta(Guerreiro s){
        if(s.nome.equals("goku") || s.nome.equals("vegeta")){
            return "O seu poder de luta é mais de 8000";
        }
        return "Voce é um verme maldito";
    }



}
