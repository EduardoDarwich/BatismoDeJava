package NivelIntermediario.records;

public class Ninja {
    private final int idade;
    private final String nome;
    private final int altura;

    public Ninja(int idade, String nome, int altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }


    public int getAltura() {
        return altura;
    }



    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Esse é o seu ninja";
    }
}
