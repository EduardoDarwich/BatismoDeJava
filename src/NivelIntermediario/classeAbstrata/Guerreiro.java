package NivelIntermediario.classeAbstrata;

public abstract class Guerreiro {

    String nome;
    int idade;
    String habilidade;

    public abstract void carregarKi();
    public abstract void esconderKi();

    public void voar(){
        System.out.println("eu estou voando");
    }

}
