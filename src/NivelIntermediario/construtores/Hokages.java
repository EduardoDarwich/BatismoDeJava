package NivelIntermediario.construtores;

public class Hokages {

    public String nome;
    public int idade;
    public boolean vivo;
    public int missoes;
    public int altura;


    //Construtor sem argumentos
    public Hokages(){
    }

    //Construtor com argumentos
    public Hokages(String nome){
        this.nome = nome;

    }

    public Hokages(int idade){
        this.idade = idade;
    }

    //Construtor com todos os argumentos
    public Hokages(int altura, int missoes, boolean vivo, int idade, String nome) {
        this.altura = altura;
        this.missoes = missoes;
        this.vivo = vivo;
        this.idade = idade;
        this.nome = nome;
    }
}
